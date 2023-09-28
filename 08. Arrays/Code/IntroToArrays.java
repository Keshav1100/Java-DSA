import java.util.Arrays;
import java.util.Scanner;

public class IntroToArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        Syntax
        datatype[] variable_name = new datatype[size]
*/
/*
        Example : storing 5 roll numbers
*/
        // int[] rnos1 = new int[5];
        /* or directly */
        // int[] rnos2 = {23,45,89,67,78};

        // Let's see what's happening step-by-step
        // int rnos; -> declaration of array, rnos is defined in the stack
        // ros = new int[5]; -> initialization of array, here object is being created in the memory(heap).

        // dynamic memory allocation: allocating memory at the runtime.


        /* 1.Array objects are in heap. */
        /* 2.Heap objects are not continuous. */
        /* 3.DMA. */
        /* In java, array objects may not be continuous. -> Depends on JVM. */

        /* By default,
        In integer array, if size declared, initially at all indexes, the value stored is 0.
        In string array, if size declared, initially at all indexes, the value stored is null.
        null -> special literal -> cannot be assigned to any primitives.

         */
        // Entering values using for-loop
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
/*
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
*/

        // Displaying using for each loop
/*
        for (int num: nums) {
            System.out.print(num+" ");
        }
*/
        // Displaying using for Arrays.toString method
        System.out.println(Arrays.toString(nums));


    }
}
