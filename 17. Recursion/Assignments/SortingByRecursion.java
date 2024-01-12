import java.lang.reflect.Array;
import java.util.Arrays;
// Perform bubble sort & selection sort using recursion
public class SortingByRecursion {
    public static void main(String[] args) {
        int[] arrSample = {1,4,3,6,8,2};
        System.out.println("Sorted using bubble sort");
        bubbleSort(arrSample,arrSample.length-1,0);
        System.out.println("Sorted using Selection sort");
        selectionSort(arrSample,arrSample.length,0,0);
        System.out.println(Arrays.toString(arrSample));
    }
    // Bubble sort using recursion
    static void bubbleSort(int[] arr,int len,int pointer){
        if(len<0){
            return;
        }
        if(pointer<len){
            if(arr[pointer] >arr[pointer+1]){
                //Swap
                int temp = arr[pointer];
                arr[pointer] = arr[pointer+1];
                arr[pointer+1] = temp;
            }
            bubbleSort(arr,len,++pointer);
        }
        else{
            bubbleSort(arr,--len,0);
        }


    }

    // Selection sort using recursion
    static void selectionSort(int[] arr,int len,int pointer,int maxIndex){
        if(len<=0){
            return;
        }
        if(pointer<len){
            if(arr[pointer] > arr[maxIndex]){
                maxIndex = pointer;
            }
            selectionSort(arr,len,++pointer,maxIndex);
        }
        else{
            //swap
            int temp = arr[len-1];
            arr[len-1]= arr[maxIndex];
            arr[maxIndex] = temp;
            selectionSort(arr,--len,0,0);
        }
    }
}
