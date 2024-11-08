/*
* WAP to find the sum of prime numbers in the array
*/
public class p4 {
    public static void main(String[] args) {
        int[] arr = {11,4,2,17,3,6};
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            if(isPrime(arr[i])){
                sum = sum +arr[i];
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int n){
        int count  = 1;
        for(int i = 1; i<= n/2;i++){
            if(n % i ==0){
                count++;
            }
        }
        return count == 2;
    }
}
