import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year ;

        System.out.println("Nhập vào năm");
        year =  scanner.nextInt();
        boolean isLeapYear = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf(year + " is a leap year");
        } else {
            System.out.printf(year + " is Not a leap year");
        }
    }
}
