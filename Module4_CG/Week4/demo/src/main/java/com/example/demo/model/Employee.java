package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private double salary;
    @ManyToOne
    private Branch branch;
}
