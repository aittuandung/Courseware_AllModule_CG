package com.demo_md4.controller;

import com.demo_md4.service.CrudProduct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Home {
//    @Auto
    CrudProduct crudProduct ;
    @GetMapping("/home")
    public String showHome(Model model){
        model.addAttribute("products", crudProduct.products);
        return "home";
    }

    @GetMapping("/admin")
    public String showAdmin(){
        return "admin";
    }
}
