/*
 * Wap  to check if the number is a prime number or not. A prime number is a whole number greater than 1 whose 
 * only factors are 1 and itself
 * A prime number is a number that has only two factors that is one and the number itself.
 */
import java.util.Scanner;

public class p17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}