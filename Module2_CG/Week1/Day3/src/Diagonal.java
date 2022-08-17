public class Diagonal {
    public static void main(String[] args) {
        int array[][] = {
                {1, 2},
                {4, 5},
                {7, 8}
        };
        int sumCol = 0;
        System.out.println("Tổng đường chéo chính: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sumCol += array[i][j];
                }
            }
        }
        System.out.println(sumCol);
    }
}
