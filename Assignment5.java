import static java.lang.Math.*;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X : ");
        double x = scanner.nextDouble();
        System.out.println("Enter Y : ");
        double y = scanner.nextDouble();

        double pow_result = pow(x, y);
        double sqrt_result = sqrt(x);

        System.out.println(pow_result);
        System.out.println(sqrt_result);



    }
}
