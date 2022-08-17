package circle_cyndler;

public class Test {
    public static void main(String[] args) {
        CircleCylinder circle = new CircleCylinder(5.0, "yellow");
        System.out.println(circle.toString());


        Cylinder cylinder = new Cylinder(10.0,5.0, "blue");
        System.out.println(cylinder.toString());
    }
}
