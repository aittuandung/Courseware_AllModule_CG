import java.sql.Date;

public class Human {
    private String fullName;
    private Date date;
    private int idNumber;

    public Human() {
    }

    public Human(String fullName, Date date, int idNumber) {
        this.fullName = fullName;
        this.date = date;
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
