//WAP to find the percentage of the type of character percentage in string
public class p11 {
    public static void main(String[] args) {
        String s = "Aa$1";
        int length = s.length();
        int uppercase = 0 , lowercase = 0, digit = 0, special=0;
        for(int i = 0; i <length;i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                uppercase++;
            }else if(Character.isLowerCase(ch)){
                lowercase++;
            } else if (Character.isDigit(ch)) {
                digit++;
            }else{
                special++;
            }
        }
        double upperPercent = (uppercase * 100.0) / length;
        double lowerPercent = (lowercase * 100.0) / length;
        double digitPercent = (digit * 100.0) / length;
        double specialpercent = (special * 100.0) / length;
        System.out.println(upperPercent);
        System.out.println(lowerPercent);
        System.out.println(digitPercent);
        System.out.println(specialpercent);
    }
}
