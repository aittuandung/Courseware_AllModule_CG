package Point2D_and_Point3D;

import java.sql.Array;

public class Point2D {
    private double x = 0.0;
    private double y = 0.0;

    public Point2D(){}

    public Point2D(double x,double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x,double y){
        this.x = x ;
        this.y = y ;
    }

    public double[] getXY() {
        double[] Arr1 = {x , y};
        return Arr1;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "X=" + x +
                ", Y=" + y +
                '}';
    }
}

