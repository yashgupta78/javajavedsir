import java.util.Scanner;

/*
WAP to convert the string upper case to lower case
 */
public class p8 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s1 = sc.nextLine();
        String op = "";
        for(int i =0; i < s1.length();i++){
            char ch = s1.charAt(i);
            if(Character.isUpperCase(ch)){
                op = op + (char) (s1.charAt(i) + 32); // -32 for lowercase
            }else{
                op = op + ch;
            }
        }
        System.out.println(op);
    }
}
