import java.util.ArrayList;
// Find the index of target elements
public class LinearSearch {
    public static void main(String[] args) {
        int[] arrSample1 = {1,2,3,2,9,10,10};
        int target = 10;
        int ans = linearSearch(arrSample1,target,0);
        ArrayList<Integer> ans2 = linearSearch2(arrSample1,target,0,new ArrayList<Integer>());
        ArrayList<Integer> ans3 = linearSearch3(arrSample1,target,0);
        System.out.println("Sample 1 target index: "+(ans<0?"Not found":ans));
        System.out.println("Sample 1 target indexes: "+(ans2.isEmpty() ?"Not found":ans2));
        System.out.println("Sample 1 target indexes 2nd method: "+(ans3.isEmpty() ?"Not found":ans3));
    }
    // To find only the first occurrence of the target
    static int linearSearch(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearSearch(arr,target,++index);
    }

    // To find multiple occurrences of the target element
    static ArrayList<Integer> linearSearch2(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return linearSearch2(arr,target,++index,list);
    }

    // Find the occurrences but don't provide list as an argument
    static ArrayList<Integer> linearSearch3(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromRemainingCalls = linearSearch3(arr,target,++index);
        list.addAll(ansFromRemainingCalls);
        return list;
    }
}
