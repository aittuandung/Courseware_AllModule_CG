package controllers;

import models.Student;

import java.util.Comparator;

public class SortBySmallToLarge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAvg()>o2.getAvg()){
            return -1;
        }else {
            return 1;
        }
    }
}

