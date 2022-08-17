package com.qlsp.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idP;
    private String nameP;
    private double price;
    private String img;
    @ManyToOne
    private Category category;
    private boolean status;

    public Product() {
    }

    public Product(int idP, String nameP, double price, String img, Category category, boolean status) {
        this.idP = idP;
        this.nameP = nameP;
        this.price = price;
        this.img = img;
        this.category = category;
        this.status = status;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
