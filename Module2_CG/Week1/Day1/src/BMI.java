import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight ,height , bmi;

        System.out.println("Nhập vào cân nặng");
        weight = scanner.nextDouble();
        System.out.println("Nhập vào chiều cao");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height,2);

        if (bmi < 18)
            System.out.printf("Thiếu cân");
        else if (bmi < 25.0)
            System.out.printf("Bình thường");
        else if (bmi < 30.0)
            System.out.printf("Thừa cân");
        else
            System.out.printf("Béo phì");
    }
}
