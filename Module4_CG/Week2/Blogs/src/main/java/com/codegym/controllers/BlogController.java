package com.codegym.controllers;

import com.codegym.models.Blogs;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/blogs")
    public ModelAndView show(@RequestParam(defaultValue = "0") int page){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("blogs", blogService.getAll(PageRequest.of(page, 2, Sort.by("date"))));
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blog", new Blogs());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("blog") Blogs blogs, @RequestParam MultipartFile upImg){
       String nameImg = upImg.getOriginalFilename();
        try {
            FileCopyUtils.copy(upImg.getBytes(),new File("/mnt/sda2/JetBrain-CodeGym/CodeGym_AllModule_Courseware/Module4_CG/Clone_folder/Blog_C0322g1/src/main/webapp/WEB-INF/img/" + nameImg));
        } catch (IOException e) {
            e.printStackTrace();
        }
        blogs.setImg("/img/"+nameImg);
        blogService.save(blogs);
        ModelAndView modelAndView = new ModelAndView("redirect:/blogs");
        return modelAndView;
    }

}
