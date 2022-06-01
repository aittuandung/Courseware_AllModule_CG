package controllers;

import io.ReadAndWrite;
import models.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ReadAndWrite readAndWrite=new ReadAndWrite();

    public void menu(){
        System.out.println("======== CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ========");
        System.out.println("----- CHỌN CHỨC NĂNG THEO SỐ (Để tiếp tục) -----");
        System.out.println("1. Xem danh sách sinh viên");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp Xếp");
        System.out.println("6. Đọc từ File");
        System.out.println("7. Ghi vào File");
        System.out.println("8. Thoát File");
        int choice = 0;
        try {
            System.out.println("-- Chọn chức năng: --");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice <0 || choice >8){
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println("Nhập lại hộ cái");
        }

        switch (choice){
            case 1:
                showListStudent();
                break;
            case 2:
                newStudent();
                break;
            case 3:
                updateStudent();
                break;
            case 4:
                deleteStudent();
                break;
            case 5:
                sortStudent();
                break;
            case 6:
                readFromFile();
                break;
            case 7:
                writeOnFile();
                break;
            case 8:
                System.exit(0);
        }
    }

    public void showListStudent(){
        for (Student s:students) {
            System.out.println(s);
        }
    }

    public void newStudent(){
        System.out.println("Mời nhập mã sinh viên");
        int idStudent = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập họ và tên sinh viên");
        String fullName = scanner.nextLine();
        System.out.println("Mời nhập tuổi");
        int old = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Mời nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Mời nhập điểm trung bình");
        double avg = Double.parseDouble(scanner.nextLine());

        Student student = new Student(idStudent, fullName, old,gender, address, avg);
        students.add(student);
    }

    public int checkIDStudent(int idStudent){
        int check = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getIdStudent() == idStudent){
                check = i;
            };
        }
        return check;
    }

    public void updateStudent(){
        System.out.println("Nhập mã sinh viên");
        String idStudent = scanner.nextLine();
        int check = checkIDStudent(Integer.parseInt(idStudent));
        if (check == -1) {
            System.out.println("Mã sinh viên không tồn tại");
            String again = scanner.nextLine();
            if (again.equals("Nhập lại")) {
                updateStudent();
            }
        } else {
            Student student = new Student();
        }
    }

    public void deleteStudent() {
        System.out.println("Nhập mã sinh viên cần xóa");
        String idStudent = scanner.nextLine();
        int check = checkIDStudent(Integer.parseInt(idStudent));
        if (check == -1) {
            System.out.println("Mã sinh viên không tồn tại");
            String again = scanner.nextLine();
            if (again.equals("Nhập lại")) {
                deleteStudent();
            }
        } else {
            System.out.println("Xóa sinh viên có msv là" + idStudent);
            String delete = scanner.nextLine();
            if (delete.equals("y")) {
                students.remove(check);
                System.out.println("Xóa thành công");
            }
        }
    }

    public void sortStudent() {
        System.out.println("----Sắp xếp sinh viên theo điểm trung bình----");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1|Sắp xếp theo điềm trung bình tăng dần");
        System.out.println("2|Sắp xếp theo điềm trung bình giảm dần");
        System.out.println("3|Thoát");
        int choice;
        while (true) {
            try {
                System.out.println("Nhập lựa chọn");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 3) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.err.println("Mời chọn lại");
            }
        }

        switch (choice){
            case 1:
                students.sort(new SortBySmallToLarge());
                break;
            case 2:
                students.sort(new SortByLargeToSmall());
            case 3:
                break;
        }
    }

    public void readFromFile(){
        System.out.println(readAndWrite.read(students));
    }

    public  void writeOnFile(){
        readAndWrite.write(students);
    }
}
