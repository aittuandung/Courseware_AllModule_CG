import java.util.Scanner;

public class VNDToUSD {
    public static void main(String[] args) {
        System.out.println("Nhập vào giá trị USD");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long output = input*230000;
        System.out.println("Giá trị VND là : " + output);
    }
}
