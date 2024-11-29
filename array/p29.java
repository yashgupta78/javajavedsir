/*
WAP to find the sum of primary and secondary diagonal in a matrix.
 */
public class p29
{
    public static void main(String[] args)
    {
            int[][] arr = {{1, 2, 3}
                          ,{4, 5, 6}
                          ,{10, 8, 2}};
            int primaryDiagonal = 0;
            int secondaryDiagonal = 0;
            for (int i = 0; i < arr.length; i++)
            {
                primaryDiagonal = primaryDiagonal +  arr[i][i];
                secondaryDiagonal = secondaryDiagonal + arr[i][arr.length - 1 - i];
            }
            System.out.println("The sum of the primary diagonal in a matrix is: "+primaryDiagonal);
            System.out.println("The sum of the secondary diagonal in a matrix is: "+secondaryDiagonal);
    }
}
