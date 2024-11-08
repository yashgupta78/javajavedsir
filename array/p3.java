/*
*WAP to find the sum of all the element int the array.
*/
public class p3 {
    public static void main(String[] args) {
        int[] a = {11,44,2,5,1};
        int sum = 0;
        for(int i = 0 ; i< a.length;i++){
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}