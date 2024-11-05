/*
 * 2. WAP to find the nth value in the Fibonacci Series.
  * Eg	n = 4
	* ===> 2 
 */
import java.util.Scanner;

public class p25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position in fibonacci series: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;

        if (n == 1) {
            c = 0;
        } else if (n == 2) {
            c = 1;
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        System.out.println("The " + n + "th fibonacci series is " + c);
    }
}