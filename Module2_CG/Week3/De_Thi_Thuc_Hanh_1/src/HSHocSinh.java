import java.util.Date;

public class HSHocSinh extends Nguoi{
    private String lop;
    private int khoaHoc;
    private int kyHoc;

    public HSHocSinh(String ten, Date ngySinh, String queQuan) {
        super(ten, ngySinh, queQuan);
    }

    public HSHocSinh(String ten, Date ngySinh, String queQuan, String lop, int khoaHoc, int kyHoc) {
        super(ten, ngySinh, queQuan);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    @Override
    public String toString() {
        return "HSHocSinh{" +
                super.toString() +
                "lop='" + lop + '\'' +
                ", khoaHoc=" + khoaHoc +
                ", kyHoc=" + kyHoc +
                '}';
    }
}
