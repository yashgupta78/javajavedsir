/*
*WAP to find the largest number int the array
*/
public class p6 {
    public static void main(String[] args) {
    int[] arr = {10,5,7,3,2,7,17,24,85};
    int large = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > large){
            large  = arr[i];
        }
    }
    System.out.println(large);
    }
}
