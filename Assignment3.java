import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int num = x.nextInt();
        int flag = 0;

        if(num == 0||num == 1) {
            System.out.println( num + " is not a prime number");
         } else {
            for(int i = 2; i <= num/2; i++) {
               if(num % i == 0) {
                  System.out.println( num + " is not prime number");
                  flag = 1;
                  break;
               }
            }
            if(flag == 0) {
               System.out.println( num + " is a prime number");
            }
         }
      }
}
