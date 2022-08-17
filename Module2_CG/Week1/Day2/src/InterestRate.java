import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        int interestRate = 1;
        long moneyOut = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số tiền gửi");
        long moneyIn = sc.nextLong();

        System.out.println("Nhập vào số năm");
        int month = sc.nextInt();

        for (int i = 0; i < month; i++) {
            moneyOut =  moneyIn*interestRate/12*month;
        }

        System.out.println("Tiền lãi: " +  moneyOut);
    }
}
