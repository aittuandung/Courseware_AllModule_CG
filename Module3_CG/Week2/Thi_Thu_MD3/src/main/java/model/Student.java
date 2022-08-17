package model;

public class Student {
    protected int id;
    protected String name;
    protected String date;
    protected String address;
    protected String phone;
    protected String email;
    protected String classHv;

    public Student() {
    }

    public Student(String name, String date, String address, String phone, String email, String classHv) {
        super();
        this.name = name;
        this.date = date;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.classHv = classHv;
    }

    public Student(int id, String name, String date, String address, String phone, String email, String classHv) {
        super();
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.classHv = classHv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassHv() {
        return classHv;
    }

    public void setClassHv(String classHv) {
        this.classHv = classHv;
    }
}
