import java.util.Scanner;

/*
WAP to remove the vowel from the string
 */
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String rev = "";
        for(int i = 0; i <s1.length();i++){
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u'){
                System.out.println();
            }else{
                rev = rev + s1.charAt(i);
            }
        }
        System.out.println(rev);
    }
}
