/*
 * Wap to swap two number without using third variable
 */
import java.util.Scanner;

public class p23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Number before swapping a = " + a);
        System.out.println("Number before swapping b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Number after swapping a = " + a);
        System.out.println("Number after swapping b = " + b);
    }
}
