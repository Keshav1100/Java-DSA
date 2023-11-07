public class OrderAgnosticSearch {
    /*
    Order-Agnostic array => sorted array but don't know in which order, ascending or descending.
     */
    public static void main(String[] args) {
        int[] sampleArr = {90,40,32,30,31,20,18,13,7,4,2};
        // 0,1,2,3, 4, 5, 6, 7, 8, 9
        int target = 30;
        System.out.println(binSearch(sampleArr,target));
    }
    static int binSearch(int[] arr,int target){
        int arrLength = arr.length-1;
        int start = 0;
        int end = arrLength;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
