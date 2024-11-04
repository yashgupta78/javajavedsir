/*
 * swap two number using third variable
 */
import java.util.Scanner;
public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  b = sc.nextInt();
        System.out.println("Number before swapping = " + a);
        System.out.println("Number before swapping = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Number after swapping a = "+a);
        System.out.println("Number after swapping b = "+b);
    }
}
