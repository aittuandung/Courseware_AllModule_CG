package Point_and_MoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(){}

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x,float y){
        this.x = x ;
        this.y = y ;
    }

    public float[] getXY() {
        float[] Arr1 = {x , y};
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