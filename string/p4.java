import java.util.Arrays;
/*
WAP to check whether given string is an anagram or not.
 */
public class p4 {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "act";
        if(s1.length() == s2.length()){
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                System.out.println("String is an anagram");
            }else{
                System.out.print("not an anagram");
            }
        }else{
            System.out.println("Not a anagram bcz length of the string is not same");
        }
    }
}
