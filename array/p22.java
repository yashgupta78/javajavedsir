import java.util.Scanner;

/*
WAP to take the user input for the 2d array
 */
public class p22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of 2d array");
        int twoD = sc.nextInt();
        System.out.println("Enter the size of 1D array");
        int oneD = sc.nextInt();
        int[][] arr = new int[twoD][oneD];
        for(int i = 0; i <arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.println("Enter the element for " + i + " " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for(int k =0; k<arr.length;k++){
            System.out.print(arr);
        }
    }
}
