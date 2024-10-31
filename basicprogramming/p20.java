/*
 * WAP to find if the number is a special number or not.
 * A number is said to be a special number if the additional of sum of the digit 
 * and product of the digits is equal to the original number.
 */
import java.util.*;

public class p20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        int temp = n;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }
        
        if (temp == product+sum) {
            System.out.println( " it is a special number " +  temp);
        }else{
            System.out.println("it is not a special number");
        }
    }
}
