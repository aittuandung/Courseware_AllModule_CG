package com.qlsp.service;

import com.qlsp.models.Category;
import com.qlsp.models.Product;
import com.qlsp.repository.CategoryRepo;
import com.qlsp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    @Autowired
    ProductRepo productRepo;
//    public ArrayList<Product> productArrayList = new ArrayList<>();
//
//    CategoryService categoryService = new CategoryService();

//    public ProductService() {
//        productArrayList.add(new Product(1, "nyc1", 3000, "https://kynguyenlamdep.com/wp-content/uploads/2022/06/anh-gai-xinh-cuc-dep.jpg", categoryService.getCatById(1), true));
//        productArrayList.add(new Product(2, "nyc2", 500, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLQ4LnUdYEXEiGsfskCc8DNKQiLFu2Djfy9A&usqp=CAU", categoryService.getCatById(0), false));
//        productArrayList.add(new Product(3, "nyc3", 600, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTefmoOps_HX3c87n2cp8GJ39-NHJ4eBa7XRw&usqp=CAU", categoryService.getCatById(0), true));
//        productArrayList.add(new Product(4, "nyc4", 7000, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtAFJxNTs9_rhk0zOyC0kaxHqmA81EzI9Vqw&usqp=CAU", categoryService.getCatById(1), false));
//    }

    public List<Product> getAll(){
        return productRepo.getList();
    }

    public void save(Product product) {
        productRepo.save(product);
    }

//    public int getIdProduct(int id){
//        for (int i = 0; i < productArrayList.size(); i++) {
//            if (productArrayList.get(i).getIdP() == id){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public Product getProductById(int id){
//        for (int i = 0; i < productArrayList.size(); i++) {
//            if (productArrayList.get(i).getIdP() == id){
//                return productArrayList.get(i);
//            }
//        }
//        return null;
//    }
//
//    public void edit(int index, Product product) {
//        productArrayList.set(index, product);
//    }
//
//    public void delete(int index){
//        for (int i = 0; i < productArrayList.size(); i++) {
//            if (productArrayList.get(i).getIdP() == index){
//                productArrayList.remove(i);
//            }
//        }
//    }
//
//    public ArrayList<Product> searchByName(String string){
//        ArrayList<Product> productSearch  = new ArrayList<>();
//        for (int i = 0; i < productArrayList.size(); i++) {
//            if (productArrayList.get(i).getNameP().contains(string)){
//                productSearch.add(productArrayList.get(i));
//            }
//        }
//        return productSearch;
//    }
}
