/*
WAP to create a 2d array using for loop
 */

public class p19 {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},{50,30,20,10},{11,12,13,31}};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0 ; j<arr[i].length;j++){
                System.out.print(arr[i][j]+ "  ");
            }
        }
    }
}
