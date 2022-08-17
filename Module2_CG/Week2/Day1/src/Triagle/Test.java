package Triagle;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape(10,10,15);
        System.out.println(shape.toString());

        Triangle triangle = new Triangle(10,10,25,"red");
        System.out.println(triangle.toString());
    }
}
