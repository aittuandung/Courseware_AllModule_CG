package com.qlsp.controllers;

import com.qlsp.models.Category;
import com.qlsp.models.Product;
import com.qlsp.service.CategoryService;
import com.qlsp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

@Controller
public class HomeController {
//    ProductService productService = new ProductService();
//    CategoryService categoryService = new CategoryService();
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;


    @GetMapping("/product")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("products", productService.getAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView  = new ModelAndView("create");
        modelAndView.addObject("categories", categoryService.getAllCat());
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("product") Product product,@RequestParam int idCate,@RequestParam MultipartFile file){
        String nameImg = file.getOriginalFilename();
        try {
            FileCopyUtils.copy(file.getBytes(), new File("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module4_CG/Week1/Views & Thymeleaf/QLSP_Thymeleaf/src/main/webapp/WEB-INF/img/" + nameImg));
        } catch (IOException e) {
            e.printStackTrace();
        }
        product.setImg("/img/" + nameImg);
        Category category = new Category();
        category.setIdC(idCate);
        product.setCategory(category);
        product.setStatus(true);
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("redirect:/product");
        return modelAndView;
    }
//    @GetMapping("/edit")
//    public ModelAndView showEdit(@RequestParam int id){
//        ModelAndView modelAndView = new ModelAndView("edit");
//        modelAndView.addObject("categories",categoryService.getAllCat() );
//        modelAndView.addObject("product", productService.getProductById(id));
//        return modelAndView;
//    }
//
//    @PostMapping("/edit")
//    public ModelAndView edit(@ModelAttribute Product product,@RequestParam int idCate,@RequestParam MultipartFile file){
//        String nameImg = file.getOriginalFilename();
//        try {
//            FileCopyUtils.copy(file.getBytes(), new File("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module4_CG/Week1/Views & Thymeleaf/QLSP_Thymeleaf/src/main/webapp/WEB-INF/img/" + nameImg));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        product.setImg("/img/" + nameImg);
//        product.setCategory(categoryService.getCatById(idCate));
//        productService.edit(productService.getIdProduct(product.getIdP()), product);
//        ModelAndView modelAndView = new ModelAndView("redirect:/product");
//        return modelAndView;
//    }
//
//    @GetMapping("/delete")
//    public ModelAndView delete(@RequestParam int id){
//        productService.delete(id);
//        ModelAndView modelAndView = new ModelAndView("redirect:/product");
//        return modelAndView;
//    }
//
//    @GetMapping("/search")
//    public ModelAndView search(@RequestParam String search){
//        ModelAndView modelAndView = new ModelAndView("search");
//        modelAndView.addObject("listSearch", productService.searchByName(search));
//        return modelAndView;
//    }
}
