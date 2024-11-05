/*
 * WAP to convert the decimal number to binary number.
 */
import java.util.Scanner;

public class p26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        while (n != 0) {
            int remainder = n % 2;
            result = remainder + result;
            n = n / 2;
        }
        System.out.println(result);
    }
}
