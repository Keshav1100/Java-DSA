public class BinarySearch1 {
   /*
   For now, we are considering the array is sorted.
    sampleArr = [2,4,6,9,11,12,14,20,36,48]

    target = 36

    1. Find the middle element
    2. if target>middle element , then search on the right
       else search in left
    3. if middle element == target, then done.

    */
   public static void main(String[] args) {
       int[] sampleArr = {2,4,6,9,11,12,14,20,36,48};
                       // 0,1,2,3, 4, 5, 6, 7, 8, 9
       int target = 36;
       System.out.println(binSearch(sampleArr,target));
   }
   static int binSearch(int[] arr,int target){
       int arrLength = arr.length-1;
       int start = 0;
       int end = arrLength;

       while(true){
           int mid = start+(end-start)/2;
           if(start>end){
               return -1;
           }
           if(arr[mid] == target){
               return mid;
           }
           if(arr[mid]<target){
               start = mid+1;
           }
           else if(arr[mid]>target){
               end = mid-1;
           }
           else {
               return -1;
           }
       }
   }
}

/*
    Why Binary search?
    -> Best case = O(1);
    -> Find the maximum no. of cases to search for?
      =
      _______________ -> N/2^0  -> Level 0
      ________        -> N/2^1  -> Level 1
      ____            -> N/2^2  -> Level 2

      _               -> 1
     => 1 = N/2^k
     => N = 2^k
     taking log
     => log(N) = k.log(2)
     => k = log(N)/log(2)
     => k = log2(N)
     in programming, we can say it log(N)
     so time complexity = O(log(N))
 */
