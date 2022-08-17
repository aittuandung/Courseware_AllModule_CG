import java.util.Date;

public class Nguoi {
    private String ten;
    private Date ngaySInh;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String ten, Date ngaySInh, String queQuan) {
        this.ten = ten;
        this.ngaySInh = ngaySInh;
        this.queQuan = queQuan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getngaySInh() {
        return ngaySInh;
    }

    public void setngaySInh(Date ngaySInh) {
        this.ngaySInh = ngaySInh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", ngaySInh=" + ngaySInh +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
