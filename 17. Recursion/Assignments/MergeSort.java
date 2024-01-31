import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int[] sample = {1,4,2,8,5,7,5};
    mergeSortInPlace(sample,0,sample.length);
        //System.out.println(Arrays.toString(mergeSort1(sample)));
        System.out.println(Arrays.toString(sample));
    }
    // Method 1: returning a new array
    public static int[] mergeSort1(int[] arr){
        // Base condition
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort1(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort1(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }
    public static int[] merge(int[] left,int[] right){
        int[] newArr = new int[left.length+right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i <left.length && j <right.length){
            if(left[i]<right[j]){
                newArr[k] = left[i];
                ++i;
                ++k;
            }
            else if(left[i]>right[j]){
                newArr[k] = right[j];
                ++j;
                ++k;
            }
            // In case there are duplicate values
            else if(left[i]==right[j]){
                newArr[k] = right[j];
                newArr[k+1] = left[i];
                ++j;
                ++i;
                k+=2;
            }
        }
        // In case left has elements left in it
        while(i<left.length){
            newArr[k] = left[i];
            ++i;
            ++k;
        }
        // In case right has elements left in it
        while(j<right.length){
            newArr[k] = right[j];
            ++j;
            ++k;
        }
        return newArr;
    }


    // Method 2: Changing the original array itself
    public static void mergeSortInPlace(int[] arr,int s,int e){
        // Base condition
        if(e-s == 1){
            return;
        }
        int mid = s+(e-s)/2;
        mergeSortInPlace(arr,0,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);

    }
    public static void mergeInPlace(int[] arr,int s,int mid,int e){
        int[] newArr = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while(i <mid && j <e){
            if(arr[i]<arr[j]){
                newArr[k] = arr[i];
                i++;
                k++;
            }
            else if(arr[i]>arr[j]){
                newArr[k] = arr[j];
                j++;
                k++;
            }
            // In case there are duplicate values
            else if(arr[i]==arr[j]){
                newArr[k] = arr[j];
                newArr[k+1] = arr[i];
                ++j;
                ++i;
                k+=2;
            }
        }
        // In case left has elements left in it
        while(i<mid){
            newArr[k] = arr[i];
            i++;
            k++;
        }
        // In case right has elements left in it
        while(j<e){
            newArr[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < newArr.length; l++) {
            arr[s+l] = newArr[l];
        }

    }

}
