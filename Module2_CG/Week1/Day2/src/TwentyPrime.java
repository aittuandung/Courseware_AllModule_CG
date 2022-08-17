public class TwentyPrime {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    number++;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number);
                count++;
                number++;
            }
        }
    }
}
