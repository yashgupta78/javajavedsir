/*
 * Wap to find the sum of all prime digits of a number.
 * Input = 587
 * Output = 12
 */
import java.util.Scanner;

public class p19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sum = sum + digit;
            }
            n = n / 10;
        }
        System.out.println(sum);
    }
}
