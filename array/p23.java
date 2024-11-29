import java.util.Scanner;

/*
WAP to find the sum of all the elements in the 2d array.
 */
public class p23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 2d array");
        int twoD = sc.nextInt();
        System.out.println("Enter the size of 1D array");
        int oneD = sc.nextInt();
        int[][] arr = new int[twoD][oneD];
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.println("Enter the element for " + i + " " + j);
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];
            }
        }
        System.out.println("The sum of all the element in array are:"+sum);
    }
}
