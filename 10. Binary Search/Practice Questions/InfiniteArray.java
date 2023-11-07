public class InfiniteArray {
/*
    Q. Find position of an element in a sorted array of infinite numbers.
    Question Link: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
*/
public static void main(String[] args) {
    int[] arr = {3, 5, 7, 9, 10, 90, 100, 130,140,160,170};
    int target = 10;
    System.out.println(mainQues(arr,target));
    }
    static int mainQues(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            // Shift the start value forward
            int newStart = end+1;
            // Change the end value to double the length or size of search arr
            end = end + ((end-start +1)*2);
            start = newStart;

        }
        return (binarySearch(arr,target,start,end));

    }
static int binarySearch(int[] arr,int target,int start,int end){
    while(start<=end){
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]>target){
             end = mid-1;
        }
        else{

            start = mid+1;
        }
    }
    return -1;
}
}
