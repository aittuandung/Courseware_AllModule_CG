package Sử_dụng_lớp_IllegalTriangleException;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a ,b ,c :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        Triangle tr = new Triangle();

        try {
            tr.triangle(a,b,c);
        }
        catch (TriangleEdgesException e) {
            System.out.println(e.getMessage());
        }
    }
}
