import java.util.Scanner;

public class MergerArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[5];
        int[] arr3 = new int[arr1.length+arr2.length];
        System.out.print("Nhập giá trị mảng 1:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Nhập giá trị mảng 2:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Giá trị mảng 3 là:");
        for (int i = 0; i < 4; i++) {
            arr3[i] = arr1[i];
            System.out.println(arr3[i]);
        }
        for (int i = 0; i < 5; i++) {
            arr3[i] = arr2[i];
            System.out.println(arr3[i]);
        }
    }
}
