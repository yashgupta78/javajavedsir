/*
WAP to add a element in a array
 */
public class p18 {
    public static void main(String[] args) {
        int[] arr = {10,30,40,50};
        printArray(arr);
        arr = add(arr, 20, 1);
        printArray(arr);
    }
    public static int[] add(int[] arr, int element, int index){
        if(index < 0 || index > arr.length){
            System.out.println(" cannot add");
            return arr;
        }
        int[] b = new int[arr.length + 1];
        b[index] = element;
        for(int i = 0; i < arr.length;i++){
            if(i < index){
                b[i] = arr[i];
            }else{
                b[i+1] = arr[i];
            }
        }
        return b;
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
