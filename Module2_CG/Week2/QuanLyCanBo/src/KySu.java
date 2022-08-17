import java.util.Date;

public class KySu extends CanBo{
    private String major;

    public KySu() {
    }

    public KySu(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "KySu{" + super.toString() +
                " major='" + major + '\'' +
                '}';
    }
}
