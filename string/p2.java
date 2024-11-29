/*
WAP to reverse the string without using inbuilt method
 */
public class p2 {
    public static void main(String[] args) {
        String s1 = "suiiiiiiii";
        String rev = "";
        for(int i = s1.length()-1;i>=0;i--){
            rev = rev + s1.charAt(i);
        }
        System.out.println(s1);
        System.out.println(rev);
    }
}
