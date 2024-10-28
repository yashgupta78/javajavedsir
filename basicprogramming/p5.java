//wap to check if the number is even or odd.
import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "even" : "odd");
    }
}

