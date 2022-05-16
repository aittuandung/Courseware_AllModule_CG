package circle_cyndler;

public class CircleCylinder {
    private double radius;
    private String color;

    public CircleCylinder(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return (radius*radius)*Math.PI;
    }

    public double getPeriMeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with " +
                "radius=" + radius + ", which is " + color;
    }

}
