/*
Leader program.
approach1
 */

import java.util.Scanner;

public class p10 {
    public static int findLeaders(int[] arr){
        int n = arr.length;
        int maxFromright = arr[n - 1];
        System.out.println(maxFromright + "");
        for(int i = n - 2 ; i >= 0; i--){
            if(arr[i] > maxFromright){
                maxFromright = arr[i];
                System.out.print(maxFromright + " ");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {8,7,4,3,5,2,1};
        System.out.print("Leaders in the array are: " + findLeaders(arr));

    }
}


// approach 2
//
// public class p10 {
//
//     public static void main(String[] args) {
//         int[] arr = {8, 7, 4, 3, 5, 2};
//         for (int i = 0; i < arr.length; i++) {
//             boolean isLeader = true;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[i]) {
//                     isLeader = false;
//                     break;
//                 }
//             }
//             if (isLeader) {
//                 System.out.println(arr[i] + " ");
//             }
//         }
//     }
// }
