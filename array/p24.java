import java.util.Scanner;

/*
WAP to take user input for the jacked array.
 */
public class p24 {
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
        for(int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
