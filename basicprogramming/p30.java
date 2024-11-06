/*
*WAP to convert octal to decimal number.
*/
import java.util.*;
public class p30 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int power = 1;
            while (n != 0) {
            int digit = n % 10;
            sum = sum + digit * power;
            power = power * 8;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
