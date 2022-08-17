import java.util.Scanner;

public class InsertValue {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần chèn : ");
        int x = sc.nextInt();

        System.out.print("Nhập vị trí X cần chèn : " );
        int index = sc.nextInt();

        int[] newArr = new int[arr.length + 1];


        System.out.println("Mảng sau khi chèn là: ");

        for (int i = 0; i < index  ; i++) {
            newArr[i] = arr[i];
            newArr[index-1] = x;
//            if (i == index){
//                newArr[i] = x;
//                break;
//            }
            System.out.println(newArr[i]);
        }
        for (int i = index -1; i < arr.length ; i++) {
            newArr[i] = arr[i];
            System.out.println(newArr[i]);
        }
    }
}
