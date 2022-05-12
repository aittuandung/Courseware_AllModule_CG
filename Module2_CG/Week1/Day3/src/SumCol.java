import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        int array[][] = {{1, 2},
                         {4, 5},
                         {7, 8}};
        int sumCol = 0;

        System.out.println("Nhập cột muốn tính tổng:");
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();

        for (int i = 0; i < array[0].length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i == col) {
                        sumCol += array[j][i];
                }
            }
        }
        System.out.println(sumCol);
    }
}
