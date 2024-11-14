/*
Given an array nums containing a distinct number in the range [0,9] return the only number in the range that is missing from the array.
Input nums  = {9,6,4,2,3,5,7,0,1}
output = 8
explanation : n = 9 since there are 9 numbers so all numbers are in the range [0,9] 8 is the missing number in the range since it does not
appear in nums.
*/
public class p8 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n = 9;
        int total = 0;
        for(int i = 0; i<=n;i++){
            total = total+ i;
        }
        int sum = 0;
        for(int j  = 0 ; j<nums.length;j++){
            sum = sum + nums[j];
        }
        int missing_value = total - sum ;
        System.out.println("The addition of the array with all the number in range [0,9] : " + total);
        System.out.println("The sum of the given array : " + sum);
        System.out.println("The missing value in the array : " + missing_value);
    }
}
