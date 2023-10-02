import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
    int[][] arr1 = {
            {1,2,4},
            {23,67,89},
            {78,6,9}
    };
        System.out.println(Arrays.toString(search(arr1,9)));
    }
    static int[] search(int[][] arr,int target){
        /*Assume that array is not empty.*/
        for(int row=0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
