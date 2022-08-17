package Quản_lý_Sản_Phẩm;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("===========MENU=========");
        System.out.println("1. New Product.");
        System.out.println("2. Edit product by ID.");
        System.out.println("3. Delete product byID.");
        System.out.println("4. Show Product list.");
        System.out.println("5. Find product by Name.");
        System.out.println("6. Sort product by Price.");
        System.out.println("7. Exit!");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                editProduct();
                break;
            case 3:
                deleteProduct();
                break;
            case 4:
                showProduct();
                break;
            case 5:
                findProduct();
                break;
            case 6:
                sortProduct();
                break;
            case 7:
                System.exit(0);
        }


    }

    public Product creatProduct() {
        System.out.println("[ Enter product name ]");
        String name = scanner.nextLine();
        System.out.println("[ Enter product date ]");
        int date = Integer.parseInt(scanner.nextLine());
        System.out.println("[ Enter product ID ]");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("[ Enter product price ]");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(name, date, id, price);
    }

    public void addProduct() {
        products.add(creatProduct());
    }

    public int findID(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                index = i;
            }
        }
        return index;
    }

    public void editProduct() {
        System.out.println("--- Enter ID product to edit --");
        int id = Integer.parseInt(scanner.nextLine());

        if (findID(id) >= 0) {
            System.out.println("-- Enter new name product -- ");
            String newName = scanner.nextLine();
            System.out.println("-- Enter new date product -- ");
            int newDate = Integer.parseInt(scanner.nextLine());
            System.out.println("-- Enter new ID product --");
            int newID = Integer.parseInt(scanner.nextLine());
            System.out.println("-- Enter new price product --");
            double newPrice = Double.parseDouble(scanner.nextLine());

            products.set(findID(id), new Product(newName, newDate, newID, newPrice));
        } else {
            System.out.println("!!! -ID Product not exist- !!!");
        }
    }

    public void deleteProduct() {
        System.out.println("--- Enter name product to delete ---");
        int id = Integer.parseInt(scanner.nextLine());

        if (findID(id) >= 0) {
            products.remove(findID(id));
        } else {
            System.out.println("!!! -Product not exist- !!! ||");
        }
    }

    public void showProduct() {
        System.out.println("[ Current product list ]");
        for (Product pr : products) {
            System.out.println(pr);
        }
    }

    public void findProduct() {
        System.out.println("--- Enter name product to find ---");
        String name = scanner.nextLine();
        boolean check = true;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                System.out.println(products.get(i));
                check = false;
            }
        }

        if (check) {
            System.out.println("Product not exist!");
        }
    }


    public void sortProduct() {
        System.out.println("1. Sort by price ascending");
        System.out.println("2. Sort by price descending");

        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                products.sort(new SortMinTOMax());
                break;
            case 2:
                products.sort(new SortMaxToMin());
                break;
        }
        showProduct();
    }
}
