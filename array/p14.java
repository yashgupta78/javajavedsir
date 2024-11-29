/*
WAP to sort the array using selection sort
*/
public class p14 {
    public static void main(String[] args) {
        int[] arr = {10,15,22,1,11,23};

        for(int i = 0; i<arr.length;i++){

            int minIndex = i; //to store the index of the smallest element.
            for(int j = i+1; j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        //to print the sorted array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}



