package Quản_lý_sản_phẩm_lưu_ra_file_nhị_phân;

import Quản_lý_sản_phẩm_lưu_ra_file_nhị_phân.Product;
import Đọc_và_ghi_danh_sách_sinh_viên_ra_file_nhị_phân.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite  {
    public void writeToFile(List<Product> products){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("product.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readFromFile(){
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("product.csv");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (ArrayList<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
