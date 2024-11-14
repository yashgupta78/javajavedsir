/*
WAP to find the second-largest number in an array.
 */
public class p7 {
    public static void main(String[] args) {
        int[] arr = {85,10,5,7,3,2,7,17,24,85};
        int large = Integer.MIN_VALUE;
        int secondLarge  = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > large){
                secondLarge = large;
                large  = arr[i];
            }else if(arr[i] > secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
        }
        System.out.println("The largest number in an array: " + large);
        System.out.println("The second-largest number in an array: " + secondLarge);
    }
}