import java.util.Scanner;
/*
Wap to sum the element of each 1d array
 */
public class p25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 2d array");
        int twoD = sc.nextInt();
        int[][] arr = new int[twoD][];
        for(int i = 0; i < arr.length;i++){
            System.out.println("Enter the size of 1D array");
            int oneD = sc.nextInt();
            arr[i] = new int[oneD];
            for(int j = 0 ; j < arr[i].length;j++){
                System.out.println("Enter the element for " + i + " " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        //addition of the 1d array
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of elements in 1d array " + i + ": " + sum);
        }
    }
}
