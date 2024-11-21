/*
WAP to merge two array in zigzag manner
 */

import java.util.Scanner;
public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input for first array
        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the element in the question");
        for(int  i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        //Input for the second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements off second array: ");
        for(int i = 0; i< n2; i++){
            arr2[i] = sc.nextInt();
        }

        //Zig zag merge
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2){
            mergedArray[k++] = arr1[i++];
            mergedArray[k++] = arr2[j++];
        }

        //Add remaining elements from the first array(if any)
        while(i < n1){
            mergedArray[k++] = arr1[i++];
        }

        //Add remaining elements from the second array(if any)
        while(j < n2){
            mergedArray[k++] = arr2[j++];
        }

        //output the merged array
        System.out.println("Merged array in zig-zag order: ");
        for(int x = 0; x < mergedArray.length;x++){
            System.out.print(mergedArray[x] + " ");
        }

    }
}