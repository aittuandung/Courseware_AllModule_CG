package Controllers;

import models.ClassCG;
import models.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagerStudent {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<ClassCG> classCGS = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ManagerStudent() {
        classCGS.add(new ClassCG("C0322G1", new Date(), " Java", 20));
        classCGS.add(new ClassCG("C0322G1", new Date(), " PHP", 20));
    }

    public void menu() {
        System.out.println("Menu");
        System.out.println("1. New Student");
        System.out.println("2. Show Student");
        System.out.println("3. Show Student by class");
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                addStudents();
                break;
            case 2:
                showAll();
                break;
            case 3:
                findAllByClass();
                break;
        }
    }

    public void addStudents() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter phone:");
        String phone = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();

        System.out.println("Select class for student");
        for (int i = 0; i < classCGS.size(); i++) {
            System.out.println("     " + (i + 1) + ": " + classCGS.get(i).getName() + " : " + classCGS.get(i).getDate() + " : " + classCGS.get(i).getCourse() + " : " + classCGS.get(i).getQuantity());
        }
        int choice = Integer.parseInt(scanner.nextLine());

        Student student = new Student(name, age, phone, address, classCGS.get(choice - 1));
        students.add(student);
    }

    public void showAll() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void findAllByClass() {
        System.out.println("Nhập tên lớp muốn hiển thị");
        String name = scanner.nextLine();
    }
}
