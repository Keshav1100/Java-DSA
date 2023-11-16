import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
int[] sample = {2,4,3,5,1};
cycleSort(sample);
        System.out.println(Arrays.toString(sample));
    }
    static void cycleSort(int[] arr){
    int i = 0 ;
    while(i<arr.length){
        int correctIndex = arr[i] -1;
        if(arr[i] != arr[correctIndex]){
            swap(arr,i,correctIndex);
        }
        else{
            i++;
        }
    }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
