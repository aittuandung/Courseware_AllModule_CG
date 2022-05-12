public class TwentyPrime {
    public static void main(String[] args) {
       int count = 0;
       int N = 2 ;
        System.out.println("20 số nguyên tố đầu tiên là");
       while (count<20){
           boolean check = true;
           for (int i = 1; i <= Math.sqrt(N); i++) {
               if (N%i==0){
                   check = false;
                   break;
               }
               if (check){
                   System.out.println("Số nguyên tố là " + N);
                   count++;
               }
               N++;
           }
       }
    }
}
