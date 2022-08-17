package Triagle;

public class Triangle extends Shape{

    private String color = "yellow";

    public  Triangle(){}

    public Triangle(double side1, double side2, double side3, String color){
        super(side1, side2 , side3);
        this.color = color;
    }

    public double getPerimeter(){
        return (getSide1()+getSide2()+getSide3());
    }
    public double getArea(){
        return Math.sqrt(getPerimeter()*(getPerimeter()-getSide1())*(getPerimeter()-getSide2())*(getPerimeter()-getSide3()));
    }


    @Override
    public String toString() {
        return "Shape{" +
                "side1=" + getSide1() +
                ", side2=" + getSide2() +
                ", side3=" + getSide3() +
                "}: " +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                ", Color=" + color
                ;
    }
}
