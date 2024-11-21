/*
WAP to sort the array using insertion sort.
 */
public class p15 {
    public static void main(String[] args) {
        int[] arr = {23,1,10,5,2};
        for(int i =1 ; i < arr.length; i++){
            int temp = arr[i];
            int j = i;
            while(j > 0 && arr[j - 1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        //to print he sorted array
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}