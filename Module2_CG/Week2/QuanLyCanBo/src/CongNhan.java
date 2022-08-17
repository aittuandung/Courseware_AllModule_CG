import java.util.Date;

public class CongNhan extends CanBo{
    private double level;

    public CongNhan() {
    }

    public CongNhan(double bac) {
        this.level = bac;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +  super.toString() +
                " level=" + level +
                '}';
    }
}
