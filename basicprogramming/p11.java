//wap to separate digits from the number

public class p11 {

    public static void main(String[] args) {
        int num = 12345;
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
}
