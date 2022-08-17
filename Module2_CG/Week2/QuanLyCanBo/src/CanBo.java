import java.util.Date;

public class CanBo {
    private String fullName ;
    private String date;
    private String gender;
    private String address;

    public CanBo() {
    }

    public CanBo(String fullName, String date, String gender, String address) {
        this.fullName = fullName;
        this.date = date;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String isGender() {
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

    @Override
    public String toString() {
        return " CanBo {" +
                "fullName='" + fullName + '\'' +
                " || date=" + date +
                " || gender=" + gender +
                " || address='" + address + '\'' +
                '}';
    }
}
