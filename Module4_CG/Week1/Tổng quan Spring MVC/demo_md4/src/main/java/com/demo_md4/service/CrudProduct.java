package com.demo_md4.service;

import com.demo_md4.model.Product;

import java.util.ArrayList;
import java.util.List;

public class CrudProduct {
    public List<Product> products = new ArrayList<>();

    public CrudProduct(){
        products.add(new Product(1,"nyc", "https://thuthuatnhanh.com/wp-content/uploads/2019/05/gai-xinh-toc-ngan-facebook.jpg", 50000));
        products.add(new Product(2, "ny", "https://i.9mobi.vn/cf/Images/huy/2021/12/6/anh-gai-xinh-9.jpg", 30000));
    }
}
