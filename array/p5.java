/*
* WAP to find the binary equivalent for each element of the array.
*/
public class p5 {
    public static void main(String[] args) {
        int[] arr = {1,5,10,4};
        for(int i = 0; i < arr.length;i++){
           String binary =  isBinary(arr[i]);
            System.out.println(arr[i] + " = " +  binary );
        }
    }
    public static String isBinary(int n){
        String result = "";
        while(n !=0){
            int remainder = n %2 ;
             result = remainder + result;
             n = n/2;
        }
        return result;
    }
}
/*
* WAP to find the element of the array which has the mostnumber of set bit(number of 1 in binary form) int its binary quivalent
*/

/*
*WAP to find the sum of each digit of the elements present in the array
*/