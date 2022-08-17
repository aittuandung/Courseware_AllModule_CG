public class StaticMethod {
    private double radius = 1.0;
    private String color = "red";

    public StaticMethod(){
    }

    public StaticMethod(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return 2*Math.PI*radius;
    }
}
