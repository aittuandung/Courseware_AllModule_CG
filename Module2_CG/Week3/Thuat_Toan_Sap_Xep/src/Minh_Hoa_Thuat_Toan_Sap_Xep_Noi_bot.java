import java.util.Scanner;

public class Minh_Hoa_Thuat_Toan_Sap_Xep_Noi_bot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = sc.nextInt();

        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            list[i] = sc.nextInt();
        }
        System.out.print("Mảng đã nhập: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("Mảng sau khi sắp xếp: ");
        BubbleSortByStep(list);
    }

    public static void BubbleSortByStep(int[] list) {
        for (int k = 0; k < list.length  ; k++) {
            for (int i = 0; i < list.length ; i++) {
                if (list[k] < list[i]) {
                    int temp = list[k];
                    list[k] = list[i];
                    list[i] = temp;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
