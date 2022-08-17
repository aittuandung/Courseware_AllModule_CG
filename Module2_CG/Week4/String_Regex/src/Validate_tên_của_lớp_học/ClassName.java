package Validate_tên_của_lớp_học;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String NAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên lớp");
        String className = scanner.nextLine();

        System.out.println(validate(className));
    }

    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
