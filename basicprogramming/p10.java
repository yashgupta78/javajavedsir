// wap a program to add all the odd number between 1 to 10

public class p10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if(i %2!=0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
