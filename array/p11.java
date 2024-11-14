/*
WAP to combine two array and display it in third array
the size of the array is not same
input = {1,2,3,4} {5,6,7}
output = {1,2,3,4,5,6,7}
 */
public class p11 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        int[] mergearray = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            mergearray[i] = arr1[i];
        }
        for(int i =0; i< arr2.length; i++){
            mergearray[arr1.length + i] = arr2[i];
        }
        for(int i = 0; i <mergearray.length;i++){
            System.out.print(mergearray[i] + " ");
        }
    }
}
