public class Cài_đặt_thuật_toán_sắp_xếp_nổi_bọt {
    static int[] list = {4, 1, 7, -2, -4, 6, -2, -6, -8};

    public static void bubbleSort(int[] list) {
        boolean checkSort = true;

        for (int i = 1; i < list.length && checkSort; i++) {
            checkSort = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    checkSort = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
