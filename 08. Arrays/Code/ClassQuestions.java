import java.util.Arrays;

public class ClassQuestions {
    public static void main(String[] args) {
        // 1. To Swap values in array
     /*
     int[] arr1 = {1,2,34,56,6};
        swap(arr1,1,4);
        System.out.println(Arrays.toString(arr1));*/
        // 2. Maximum value of array
     /*
     int[] arr1 = {1,2,34,56,6};
        System.out.println(maxVal(arr1));*/


        // 3. Reversing an array
     int[] arr1 = {1,2,34,56,6};
        reverseArr(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void swap(int[] arr,int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
    static int maxVal(int[] arr){
        int maxElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxElem){
                maxElem = arr[i];
            }
        }
        return maxElem;
    }
    static void reverseArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
}
