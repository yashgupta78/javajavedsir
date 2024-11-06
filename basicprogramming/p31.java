/*
*WAP to convert any number system into any number system.
*/
import java.util.Scanner;
public class p31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int power = 1;
        while(n != 0){
            int digit = n % 10 ;
            sum = sum + digit * power;
            power = power * 2;
            n = n /10;
        }
    String octal  = "";
    while(sum != 0){
        int remainder = sum % 8;
        octal = remainder +octal ;
        sum = sum / 8;
    }
System.out.println(octal);
}
}