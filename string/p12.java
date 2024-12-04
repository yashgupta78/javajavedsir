//input  = M1U2MBA4I
//output = 6MUMBAI10
public class p12 {
    public static void main(String[] args) {
        String s = "M1U2MB3A4I";
        String res = "";
        int sum= 0 ;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                res = res + s.charAt(i);
            }else {
                sum = sum + (s.charAt(i) - '0');
            }
        }
        System.out.print(res.length() + res + sum);
    }
}