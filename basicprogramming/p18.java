/*
 * Wap to find all the prime number in the range of 1-100.
 */
import java.util.Scanner;

public class p18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        for (int i = 2; i <= n; i++) {
            count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }

    }
}
