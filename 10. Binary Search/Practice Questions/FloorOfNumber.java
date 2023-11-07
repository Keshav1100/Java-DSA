public class FloorOfNumber {
    /*
   Q.
   arr = [2,3,5,9,14,16,18]
   target = 15
   Floor = greatest element smaller than or equal to the target

   A.
   1. See that it can be seen sorted.
       ****
       IMPORTANT:-
       break condition for binary search => (start<=end) has to be true
       ****
    */
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 6;
        System.out.println(floorArr(arr,target));

    }
    public static int floorArr(int[] arr, int target){
        if(arr[0]>target){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }

        }
        return arr[end];
    }
}
