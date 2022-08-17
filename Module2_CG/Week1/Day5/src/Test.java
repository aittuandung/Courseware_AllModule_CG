import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new Class: ");
        String classes = scanner.nextLine();
        SetOnly newSet = new SetOnly();
        newSet.setName(name);
        newSet.setClasses(classes);
    }
}
