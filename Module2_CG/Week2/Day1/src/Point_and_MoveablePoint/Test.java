package Point_and_MoveablePoint;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Moveablepoint M1 = new Moveablepoint(10,10,1,1);
        System.out.println(Arrays.toString(M1.Move()));
    }
}
