// Check if array is sorted using recursion
public class Sorted {
    public static void main(String[] args) {
        int[] arrSample1 = {1,2,3,2,9};
        System.out.println("Sample 1: "+sortedArr(arrSample1,0));
    }
    public static boolean sortedArr(int[] arr,int index){
        if((index+1) >= arr.length-1){
            return arr[index]<=arr[index+1];
        }
        return arr[index]<=arr[index+1] && sortedArr(arr,++index);
    }
}
