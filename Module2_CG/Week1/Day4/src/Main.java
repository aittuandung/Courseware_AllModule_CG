import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Chiều rộng: ");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều dài: ");
        double height = sc.nextDouble();
        Rectangle rec1 = new Rectangle(width,height);
        System.out.println("Kích thước nhập vào là : "+ rec1.Display());
        System.out.println("Chu vi HCN là : " + rec1.getArea());
        System.out.println("Diện tích HCN lả : " + rec1.Perimeter());
    }
}
