import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        System.out.println("Nhập vào tên");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Hello " + input);
    }
}
