import java.util.Scanner;

/*
WAP to print the largest element of array from each row
 */

public class p27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the 2D array
        System.out.println("Enter the number of rows for the 2D array:");
        int twoD = sc.nextInt();
        int[][] arr = new int[twoD][];

        // Initialize each row and input its elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the size of row " + (i + 1) + ":");
            int oneD = sc.nextInt();
            arr[i] = new int[oneD];

            System.out.println("Enter " + oneD + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < oneD; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Find and print the largest element in each row
        System.out.println("Largest element in each row:");
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0]; // Assume first element is the largest
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + ": " + max);
        }
    }
}

