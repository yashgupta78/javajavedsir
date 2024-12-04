import java.util.Scanner;

/*
WAP to check whether the string is palindrome or not
 */
public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        if(s.equalsIgnoreCase(rev)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
