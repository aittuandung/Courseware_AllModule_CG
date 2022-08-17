import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào giá trị a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập vào giá trị a: ");
        double b = sc.nextDouble();
        System.out.print("Nhập vào giá trị a: ");
        double c = sc.nextDouble();

        QuadraticEquation pt1 = new QuadraticEquation(a, b, c);
        System.out.println("Phương trình nhập vào là: " + a + "x^2" + " + " + b + "x" + " + " + c + " = 0");

        if (pt1.getDiscriminant() < 0 ) {
            System.out.println("Phương trình vô nghiệm");
        }
        else {
            System.out.println("Phương trình có nghiệm 1 là: " + pt1.getRoot1());
            System.out.println("Phương trình có nghiệm 2 là: " + pt1.getRoot2());
        }
    }
}
