/*
WAP to search a element using binary search
 */
public class p17 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int search = 40,sp = 0, ep = arr.length-1, index = -1;
        while(sp <= ep){
            int mid = (sp + ep) / 2;
            if(search == arr[mid]){
                index = mid;
                break;
            }
            else if(search < arr[mid]){
                ep = mid - 1;
            }
            else if(search > arr[mid]){
                sp = mid + 1;
            }
        }
        System.out.print(index);
    }
}