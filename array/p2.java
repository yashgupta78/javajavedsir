/*
Write a Java program that takes input from the user to create an array of integers. The program should:

Ask the user to specify the size of the array.
Prompt the user to enter integer values for each index in the array.
After all values have been entered, print each value in the array on a new line.
 */
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size  = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i< arr.length;i++){
            System.out.println("Enter the values for the index : " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("----------");
        for(int i : arr){
            System.out.println(i);
        }
    }
}
