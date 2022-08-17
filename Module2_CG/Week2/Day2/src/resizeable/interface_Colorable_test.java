package resizeable;

public class interface_Colorable_test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "yellow", false);
        shapes[1] = new Rectangle(15, 10, "blue", false);
        shapes[2] = new Square(20, "red", false);

        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
            if (shape instanceof Circle) {
                System.out.println(((Circle) shape).getArea());
            } else if (shape instanceof Rectangle){
                System.out.println(((Rectangle) shape).getArea());
            } else {
                System.out.println(((Square) shape).getArea());
            }
        }
    }
}
