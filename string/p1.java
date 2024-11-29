/*
WAP to basic of string(why it is immutable)
 */
public class p1 {
    public static void main(String[] args) {
        String s1 = "welcome";
        String s2 = "welcome";

        System.out.println(s1 == s2);

        String s3 = new String("welcome");
        String s4 = new String("welcome");

        System.out.println(s3 == s4);

    }
}