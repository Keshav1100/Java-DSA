public class SearchInRange {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,78,89,6};
        System.out.println(search1(arr1,900,2,9));
    }
    static int search1(int[] arr,int target,int start, int end){
        if(arr.length == 0 || start < 0 || end>=arr.length){
            return -1;
        }
        for (int i = start; i <=end ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
