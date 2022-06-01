package io;

import models.ClassCG;
import models.Student;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ReaderAndWrite {
    File file = new File("student.csv");

    public void write(ArrayList<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> reader(ArrayList<ClassCG> classCGS) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            
        }catch (IOException e) {
            System.err.println("File chưa tồn tại");
        }
        return students;
    }
}
