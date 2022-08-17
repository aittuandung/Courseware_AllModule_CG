package models;

public class Student {
    private int idStudent;
    private String fullName;
    private int old;
    private String gender;
    private String address;
    private double avg;

    public Student() {
    }

    public Student(int idStudent, String fullName, int old, String gender, String address, double avg) {
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.old = old;
        this.gender = gender;
        this.address = address;
        this.avg = avg;
    }



    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", fullName='" + fullName + '\'' +
                ", old=" + old +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", avg=" + avg +
                '}';
    }
}
