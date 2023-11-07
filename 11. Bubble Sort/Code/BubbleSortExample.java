import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
    int[] arr = {1,5,3,4};
    sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }

        }
    }
}
