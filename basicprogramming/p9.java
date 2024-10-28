//wap to find the product of all the number in range 1 to 5

public class p9 {

    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}
