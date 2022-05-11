public class TwelvePrime {
    public static void main(String[] args) {
        int a = 20;
        int count = 0;
        boolean check = true;
        System.out.println("20 số nguyên tố đầu tiên là: ");
        while (count<20){
            for (int i = 2; i < 1000; i++) {
                for (int j = 1; j < Math.sqrt(i); j++) {
                    if (i%j==0){
                        check = false;
                        break;
                    }
                    if (check){
                        System.out.println("Số nguyên tố  là " + i);
                    }
                }
            }
            count++;
        }
    }
}
