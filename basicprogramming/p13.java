//wap to find the factor a given number

import java.util.Scanner;

public class p13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
}
