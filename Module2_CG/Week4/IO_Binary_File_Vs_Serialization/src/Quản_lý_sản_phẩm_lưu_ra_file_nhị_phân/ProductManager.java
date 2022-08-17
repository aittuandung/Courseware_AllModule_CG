package Quản_lý_sản_phẩm_lưu_ra_file_nhị_phân;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager  {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();
    ReadAndWrite readAndWrite = new ReadAndWrite();

    public void menu(){
        try {
            System.out.println("======MENU======");
            System.out.println("1. Add product");
            System.out.println("2. Show product");
            System.out.println("3. Find Product");
            System.out.println("4. Exit! ");

            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    findProduct();
                    break;
                case 4:
                    System.exit(0);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addProduct(){
        System.out.println("Enter ID");
        String id = scanner.nextLine();
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Agency");
        String agency = scanner.nextLine();
        System.out.println("Enter price");
        String price = scanner.nextLine();

        Product product = new Product(id, name, agency, price);

        products.add(product);
        readAndWrite.writeToFile( products);
    }

    public void showProduct(){
        System.out.println("List Product:");
        List<Product> productList = readAndWrite.readFromFile();
        for (Product s: products
             ) {
            System.out.println(s.toString());
        }
    }

    public void findProduct(){
        System.out.println("Enter Name to find");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductName().equals(name)){
                System.out.println(products.get(i).toString());
            }
        }
    }
}
