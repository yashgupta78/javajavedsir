class MaxDifference{
    public static int maxDifference(int[] arr){
        int minElement = arr[0];
        int maxDiff = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - minElement > maxDiff){
                maxDiff = arr[i] - minElement;
            }
            if(arr[i] < minElement){
                minElement = arr[i];
            }
        }
        return maxDiff;
    }
    public static void main(String[] arg){
        int[] arr1 = {2,3,10,6,4,8,1};
        System.out.println(" Maximum Difference : " + maxDifference(arr1));
        int[] arr2 = {7,9,5,6,3,2};
        System.out.println(" Maximum Difference : " +maxDifference(arr2));
    }
}