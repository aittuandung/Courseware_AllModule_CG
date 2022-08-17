package Point2D_and_Point3D;

public class Point3D extends Point2D {
    double z = 0.0;

    public Point3D(){}

    public Point3D(double x , double y , double z){
        super(x,y);
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setXYZ(double x, double y, double z){
        setXY(x,y);
        this.z =z;
    }

    public double[] getXYZ() {
        double[] Arr2 = {getX(), getY(), z};
        return Arr2;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
