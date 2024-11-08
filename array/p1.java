/*
 WAP for the execution of foreach and for loop.
 */
public class p1 {
    public static void main(String[] args) {
        int arr[] = { 10,20,30,40,50};
        System.out.println("for loop");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("For each loop");
        for(int j :arr){
            System.out.println(j);
        }
    }
}
