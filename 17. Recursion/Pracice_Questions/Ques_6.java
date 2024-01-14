import java.util.ArrayList;
import java.util.List;

public class Ques_6 {
    // Print all the subsets of a given array
    public static void main(String[] args) {
    List<List<Integer>> list = subset(new int[] {1,2,4});
        for (List<Integer> item:list) {
            System.out.print(item+" , ");
        }
        //System.out.println(list);
    }
    public  static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
