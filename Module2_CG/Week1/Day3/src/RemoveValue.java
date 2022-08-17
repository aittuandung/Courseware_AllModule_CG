import java.util.Arrays;
import java.util.Scanner;

public class RemoveValue {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("Nhập vị trí X cần xóa : " );
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int[] newArr = new int[arr.length];
        System.out.println("Mảng sau khi xóa là: ");
        for (int i = X; i < arr.length ; i++) {
            for (int j = 0 ; j < 1; j++) {
                newArr[j] = arr[i];
//                if (j == X) {
//                    continue;
//                }
                System.out.println(newArr[j]);
            }
        }
    }
}
