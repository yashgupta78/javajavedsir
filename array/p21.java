/*
WAP to access all the odd element in the 2d array
 */
public class p21 {
    public static void main(String[] args) {
        int[][] arr = {{10,20,3},{5,30,20,10},{11,12,13,31}};
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(arr[i][j] % 2 != 0){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
