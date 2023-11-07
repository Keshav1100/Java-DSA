public class RotationCount {
    public static void main(String[] args) {
        int[] arr1 = {89,1,2,3,4,56,76};
        System.out.println("Array is rotated "+(searchPivot(arr1)+1)+" times.");
    }
    static int searchPivot(int[] arr){
        // In case the length is 1 only, so no rotation is possible
        if(arr.length == 1){
            return -1;
        }
        int value = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
        // Case 1: when arr[mid]>arr[mid+1], means you found it
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
        // Case 2: when arr[mid]<arr[mid-1] => ans = mid - 1
            if(arr[mid] < arr[mid-1]){
                return mid-1;
            }
        // Case 3: if start >= mid element => all elements on right of mid will be smaller than or equal to start, and so we can ignore all these elements as we are looking for peak and so we know that largest element lies on left now. => end = mid-1
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }
        // Case 4: start <= mid element, means peak is on the right
            else{
                start = mid+1;
            }
        }

        return value;
    }

}
