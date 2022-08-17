package io;

import models.ClassCG;
import models.Student;

import java.io.*;
import java.util.ArrayList;

public class ReaderAndWriteByte implements Serializable {
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
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            objectInputStream.read();
            objectInputStream.close();
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
