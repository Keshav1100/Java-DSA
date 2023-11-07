import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {
        /*
        row sorted and col sorted 2D array:->
        1   2   3   4
        5   6   7   8
        9   10  11  12          9
        13  14  15  16
        consider columns for considering start and end
        ex. here 1 is start and 4 is end
        so then start
        case 1 : elem == target
        case 2 : elem>target => ignore rows after it
        case 3 : elem<target => ignore rows below it

        in the end we left with 2 rows
        -> check for middle column and then see if it contains the target elem

        -> if not, check for target in surrounding 4 arrays left using binary search only

        */
        int[][]  arr2D = {
                {1, 2, 3, 4},
                {5, 6 ,7 ,8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 19;
        System.out.println(Arrays.toString(search(arr2D,target)));
    }

    // searching in provided row in provided cols range
    static int[] binarySearch(int[][] matrix,int row, int cStart, int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]== target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] > target){
                cEnd = mid-1;
            }
            else{
                cStart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // It may be empty
        // If only 1 row, return its binary search
        if(cols==0){
            return new int[]{-1,-1};
        }
        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        // search until we get 2 rows:
        int rowStart = 0;
        int rowEnd = rows-1;
        int cMid = cols/2;
        while(rowStart<(rowEnd-1)){
            int mid = rowStart + (rowEnd-rowStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]>target){
                rowEnd = mid;
            }
            else{
                rowStart = mid;
            }
        }
        // now we have 2 rows left
        // Check if the element is in mid col
        if(matrix[rowStart][cMid]== target){
            return new int[]{rowStart,cMid};
        }
        if(matrix[rowStart+1][cMid]== target){
            return new int[]{rowStart+1,cMid};
        }

        // else check in left 4 half
        // check in 1st half
        if (matrix[rowStart][cMid-1]>= target){
            return binarySearch(matrix,rowStart,0,cMid-1,target);
        }
        // check in 2nd half
        if (matrix[rowStart][cMid+1]<= target && target<=matrix[rowStart][cols-1]){
            return binarySearch(matrix,rowStart,cMid+1,cols-1,target);
        }
        // check in 3rd half
        if (matrix[rowStart+1][cMid-1]>= target){
            return binarySearch(matrix,rowStart+1,0,cMid-1,target);
        }
        // check in 4th half
        else{
            return binarySearch(matrix,rowStart+1,cMid+1,cols-1,target);
        }

    }
}
