/*
WAP to convert lowercase to uppercase  and uppercase to lowercase.
 */
public class p3 {
    public static void main(String[] args) {
        String s  = "tHaNE";
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] = (char)(arr[i] - 32);
            }else if(Character.isUpperCase(arr[i])){
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        String res = new String(arr);
        System.out.print(res);
    }
}
