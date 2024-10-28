//wap to print number from 1 to 500 without using loop means method recursion.

public class p3 {

    public static void main(String[] args) {
        printNumber(1);
    }

    public static void printNumber(int n) {
        if (n <= 500) {   //it will help use to avoid the stack over flow error
            System.out.println(n);
            printNumber(n + 1);
        }
    }
}