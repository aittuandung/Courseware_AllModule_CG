package Validate_số_điện_thoại;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String NUMBER_REGEX = "\\w+@\\w+(\\.\\w){1,2}";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại");
        String className = scanner.nextLine();

        System.out.println(validate(className));
    }

    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
