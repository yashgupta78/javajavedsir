import java.util.Scanner;

/*
WAP to check whether the password is strong or not
 */
public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        if(password.length() >= 8){
            boolean isUpper = false, isLower = false, isdigit = false, isSpecial = false;
            for(char ch : password.toCharArray()){
                if(Character.isUpperCase(ch)){
                    isUpper = true;
                }else if(Character.isLowerCase(ch)){
                    isLower = true;
                }else if(Character.isDigit(ch)){
                    isdigit = true;
                } else {
                    isSpecial = true;
                }
            }
            if(isUpper && isLower && isdigit && isSpecial){
                System.out.println("Strong password");
            }else{
                System.out.println("Weak password");
            }
        }else{
            System.out.println("the length of the password is not 8");
        }
    }
}
