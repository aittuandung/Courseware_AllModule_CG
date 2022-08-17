import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: " );
        double radius = scanner.nextDouble();
        StaticMethod circle = new StaticMethod(radius);
        System.out.println("Area : " + circle.getArea());
    }
}
