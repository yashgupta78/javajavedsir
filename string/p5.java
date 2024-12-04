/*
WAP to convert the string into a title case.
 */
public class p5 {
    public static void main(String[] args) {
        String s  = "the quick BROWN fOx";
        String[] arr = s.split(" ");
        for(String str : arr){
            System.out.print(isTitle(str) + " ");
        }
    }
    public static String isTitle(String s){
        char[] ch = s.toCharArray();
        if(ch[0] >= 'a' && ch[0] <= 'z'){
            ch[0] = (char)(ch[0] - 32);
        }
        for(int i = 1; i<ch.length;i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char) (ch[i] + 32);
            }
        }
        return new String(ch);
    }
}
