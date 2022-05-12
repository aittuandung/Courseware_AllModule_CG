import java.util.Scanner;

public class ShowGeometry {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hình chữ nhật");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Tam giác vuông 3");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Tam giác vuông 4");
                    System.out.println("Tam giác vuông 3");
                    for (int i = 6; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
