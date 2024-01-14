import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques_7 {
    // Print all the subsets of a given array having duplicate
    // elements as well

    public static void main(String[] args) {
        List<List<Integer>> list = subsetDuplicate(new int[] {1,4,4});
        for (List<Integer> item:list) {
            System.out.print(item+" , ");
        }
    }
    public  static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0;i<arr.length;i++) {
            int n = outer.size();
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            for (int j = start; j < n; j++) {

                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
