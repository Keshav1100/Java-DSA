import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] sample = {5,6,-2,3,1};
        insertionSort(sample);
        System.out.println(Arrays.toString(sample));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
