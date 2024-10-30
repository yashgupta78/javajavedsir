//wap a program to find the count of factor of a given number
import java.util.Scanner;
public class p15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}