/*
 * WAP to check weather a given number is strong number or not.
 */
import java.util.*;

public class p21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int digit = n % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("it is a strong number");
        } else {
            System.out.println("it is not a strong number");
        }
    }
}
