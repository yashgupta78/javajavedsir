//wap to print the number from 5 to 1 using recursion.

public class p4 {

    public static void main(String[] args) {
        printNumber(5);
    }

    public static void printNumber(int n) {
        if (n >= 1) {
            System.out.println(n);
            printNumber(n-1);
        }
    }
}
