import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Nhập số cần kiểm tra");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean check = true;

        for (int i = 1; i < Math.sqrt(input); i++) {
            if (input % i == 0) {
                check = false;
                break;

            }
            if (check) {
                System.out.println(input + " là số nguyên tố");
            } else {
                System.out.println(input + " Không là số nguyên tố");
            }
        }
    }
}
