import java.util.Date;

public class NhanVien extends CanBo{
    private String job;

    public NhanVien() {
    }

    public NhanVien(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString() +
                " job='" + job + '\'' +
                '}';
    }
}
