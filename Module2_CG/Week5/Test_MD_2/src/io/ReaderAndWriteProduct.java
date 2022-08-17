package io;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderAndWriteProduct {
    File file = new File("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module2_CG/Week5/Test_MD_2/src/data/product.csv");

    public void Write(List<Product> products) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("id,name,price,total,description");
            bufferedWriter.newLine();
            for (Product s : products) {
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
//            File myObj = new File("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module2_CG/Week5/Test_MD_2/src/data/product.csv");
            Scanner myReader = new Scanner(file);
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
}
