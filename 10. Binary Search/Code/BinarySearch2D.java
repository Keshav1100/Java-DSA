import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        /*
        row sorted and col sorted 2D array:->
            1   2   3   4
            5   6   7   8
            9   10  11  12
            13  14  15  16
        consider columns for considering start and end
        ex. here 1 is start and 4 is end
        so then start
        case 1 : elem == target
        case 2 : elem>target => col--
        case 3 : elem<target => row++
         */
int[][]  arr2D = {
        {1, 2, 3, 4},
        {5, 6 ,7 ,8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
};
int target = 16;
        System.out.println(Arrays.toString(search2D(arr2D,target)));
    }
    static int[] search2D(int[][] matrix,int target){
    int row = 0;
    int col = matrix.length-1;
    while(row<matrix.length && col>=0){
        if(matrix[row][col]==target){
            return new int[]{row,col};
        }
        else if(matrix[row][col]<target){
            row++;
        }
        else{
            col--;
        }
    }
    return new int[]{-1,-1};
    }
}
