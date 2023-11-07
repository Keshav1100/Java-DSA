public class DuplicateRotatedArray {
    public static void main(String[] args) {
        // nums = [4,5,6,7,0,1,2] - original array
        // nums1 = [2,4,5,6,7,0,1] - rotated once array
/*

in case of ascending sorted array:
approach 1:
  i. Find pivot: largest element in the array after which elements start decreasing.
  ii. search in first half and the second half
      So, now let's see how to find pivot:
      1st option:
            do binary search and when arr[mid]>arr[mid+1], means you found it. ans = mid
      2nd option:
            if arr[mid]<arr[mid-1] => ans = mid - 1
      3rd option:
            if start >= mid element => all elements on right of mid will be smaller than or equal to start, and so we can ignore all these elements as we are looking for peak and so we know that largest element lies on left now. => end = mid-1
      4th option:
            if start <= mid element => all elements on left of mid will be in asc order, i.e, sorted, and so we can ignore all these elements as we are looking for peak and so we know that largest element lies on right now. => start = mid+1


 */
int[] nums = {4,5,6,7,0,1,5,2};
int target = 5;
   c
}
    static int searchPivot(int[] arr){
        if(arr.length == 1){
            return 0;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // if start,mid and end are =, then remove the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                // if end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // if left side is sorted, then
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])){
                    start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int start, int end,int target){
        int value = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                value = mid;
                return value;
            }
        }
        return value;
    }
}
