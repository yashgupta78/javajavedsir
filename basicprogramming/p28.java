/*
 * WAP to convert the decimal number to octal number.
 */
import java.util.Scanner;

public class p28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        while (n != 0) {
            int remainder = n % 8;
            result = remainder + result;
            n = n / 8;
        }
        System.out.println(result);
    }
}
