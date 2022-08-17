package com.qlsp.service;

import com.qlsp.models.Category;
import com.qlsp.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;
//    public ArrayList<Category> categoryArrayList = new ArrayList<>();

//    public CategoryService(){
//        categoryArrayList.add(new Category(0, "Street"));
//        categoryArrayList.add(new Category(1, "Hotel"));
//    }

    public List<Category> getAllCat(){
        return categoryRepo.getList();
    }
//    public Category getCatById(int id){
//        for (int i = 0; i < categoryArrayList.size(); i++) {
//            if (categoryArrayList.get(i).getIdC() == id){
//                return categoryArrayList.get(i);
//            }
//        }
//        return null;
//    }
}
