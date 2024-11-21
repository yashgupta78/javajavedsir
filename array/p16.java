/*
WAP to search a element in an array using linear search.
 */
public class p16 {
    public static void main(String[] args) {
        int[] arr = {23,1,10,5,2};
        int search = 10;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == search ){
                index = i;
            }
        }
        System.out.print(index);
    }
}
