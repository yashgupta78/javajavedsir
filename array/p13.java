/*
WAP to sort array using bubble sort algorithm
 */
public class p13 {
    public static void main(String[] args) {
        int[] arr = {15,11,3,6,7,2};
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j <arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //to display the sorted array;
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}