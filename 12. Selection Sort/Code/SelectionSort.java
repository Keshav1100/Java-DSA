package PACKAGE_NAME;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] sampleArr = {1,-2,7,2,4};
    selectionSort(sampleArr);
    System.out.println(Arrays.toString(sampleArr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // Finding the largest item in the array and swapping it with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
            
        }
    }
    static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
