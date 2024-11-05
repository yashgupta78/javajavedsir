/*
 * WAP to convert decimal number to hexadecimal number.
 */
import java.util.Scanner;

public class p27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        while (n != 0) {
            int remainder = n % 16;
            if(remainder < 10 ){
                result = remainder + result;
            }else{
                result = (char)('A' + (remainder -10)) + result;
            }
            n = n / 16;
        }
        System.out.println(result);
    }
}
