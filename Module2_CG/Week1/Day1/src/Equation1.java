import java.util.Scanner;

public class Equation1 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 1");
        System.out.println("Pt bậc 1 có dạng 'a * x + b = c', nhập tham số:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();
        double answer = (c - b)/a;

        if (a==0){
            if (b==c){
                System.out.println("Phương trình vô số  nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else {
            System.out.println("Phương trình có nghiệm là = " + answer);
        }
    }
}
