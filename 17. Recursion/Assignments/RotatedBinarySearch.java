// Rotated Binary Search using Recursion
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arrSample = {3,4,5,6,7,8,1,2};
        int target = 2;
        System.out.println(search(arrSample,target,0, arrSample.length-1));
    }
    public static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start +(end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target<=arr[mid] && arr[start]<=target){
                return search(arr,target,start,mid-1);
            }
            else{
                return search(arr,target,mid+1,end);
            }
        }
        if(arr[mid]<=target && target<=arr[end]){
            return search(arr,target,mid+1,end);
        }
        return search(arr,target,start,mid-1);
    }
}
