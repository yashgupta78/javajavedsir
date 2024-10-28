//wap to check weather it is a leap year or not  

public class p7 {

    public static void main(String[] args) {
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}