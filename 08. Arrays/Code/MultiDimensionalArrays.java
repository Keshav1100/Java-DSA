import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
         1 2 3
         4 5 6
         7 8 9
*/

        // Syntax
        // int[][] arr2D = new int[no. of rows(mandatory)][no. of columns(not mandatory)]
        int[][] arr2D = new int[3][3];


        /* Input */
        for (int i = 0; i < arr2D.length; i++) {
            // Ensure that u have initialized the number of columns
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = input.nextInt();
            }
        }
        /* Output */
        for(int[] elem:arr2D){
            System.out.println(Arrays.toString(elem));
        }
    }
}
