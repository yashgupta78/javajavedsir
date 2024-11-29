/*
WAP to create a 2d array using foreach loop
 */
public class p20 {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},{50,30,20,10},{11,12,13,31}};
        for(int[] i : arr){
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
