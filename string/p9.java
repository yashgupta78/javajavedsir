/*
"Write a Java program to check whether a given string (ignoring spaces) is a palindrome.
For example, if the input is 'race car', the program should print 'yes'. Otherwise, it should print 'no'."
 */
public class p9 {
    public static void main(String[] args) {
        String s = "race car";
        String op = "";
        //remove space
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                op = op + s.charAt(i);
            }
        }
        //two pointer
        int i = 0, j = op.length() - 1;
        boolean isPalindrome = true ;
        while(i < j){
            if(op.charAt(i) != op.charAt(j)){
                isPalindrome = false;
                break;
            }
            j--;
            i++;
        }
        if(isPalindrome){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
