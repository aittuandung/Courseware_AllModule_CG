import java.util.Scanner;

public class MaxIn2DimationalArray {
    public static void main(String[] args) {
        int array[][] = {{1,2},{4,5},{7,8}};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[j].length; j++) {
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất là : " + max);
    }
}
