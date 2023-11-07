public class RotatedSortedArray {
    public static void main(String[] args) {
        // nums = [4,5,6,7,0,1,2] - orginial array
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
    }
}
