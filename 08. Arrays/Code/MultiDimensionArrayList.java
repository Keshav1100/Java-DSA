import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
//      Initialization
        for (int i = 0; i < 3; i++) {
            // Adding empty arraylist as default value is null
            list2D.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j  = 0; j < 3; j++) {
                list2D.get(i).add(input.nextInt());
            }
        }
        System.out.println(list2D);
    }
}
