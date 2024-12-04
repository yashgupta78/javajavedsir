import java.util.Set;
import java.util.TreeSet;

public class p10 {
    public static void main(String[] args) {
        String s = "The five boxing wizards jump quickly.";
        s = s.toLowerCase();
        Set<Character> set = new TreeSet<>();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                set.add(s.charAt(i));
            }
        }
        //wap to check if the string is pangram or not.
        if(set.size() == 26){
            System.out.println("pangram");
        }else{
            System.out.println("not a pangram");
        }
        //wap to find the minimum number of character required for the string to become the panagram.
        if(26 - set.size() == 0){
            System.out.print("not required");
        }else {
            System.out.print(26 - set.size() == 0);
        }

    }
}
