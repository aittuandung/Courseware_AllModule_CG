package io;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderAndWriteProduct {
    public  void Write(List<Product> Products) {
        try {
            FileWriter fileWriter = new FileWriter("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module2_CG/Week5/Thi_Thu_Bai2/src/data/product.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product s : Products) {
                bufferedWriter.write(s.write());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reader() {
        try {
            File myObj = new File("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module2_CG/Week5/Thi_Thu_Bai2/src/data/contacts.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public ArrayList<Product> reader(List<Product> products) {
        ArrayList<Product> Products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module2_CG/Week5/Thi_Thu_Bai2/src/data/product.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            while ((str = bufferedReader.readLine()) != null) {
                String[] arr = str.split(",");
                String idProduct = arr[0];
                String nameProduct = arr[1];
                double price = Double.parseDouble(arr[2]);
                int total = Integer.parseInt(arr[3]);
                String description = arr[4];

                Products.add(new Product(idProduct,nameProduct,price,total,description));
            }

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Products;
    }
}
