/*
 * Wap to check the number is a perfect number or not. A perfect number is defined as
 *  a positive integer which is equal to the sum of its positive factors excluding the number itself.
 */
import java.util.*;

public class p16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println(n + " it is a perfect number");
        } else {
            System.out.println(n + "it is not a prime number");
        }

    }
}
