import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        //Synatx
      //  ArrayList<Datatype> variable_name = new ArrayList<Datatype>();
        ArrayList<Integer> variable_name = new ArrayList<Integer>();


        // Adding items
        variable_name.add(90);
        variable_name.add(909);
        variable_name.add(906);
        variable_name.add(90678);

        // printing all the items
        System.out.println(variable_name);

        // Updating any index
        variable_name.set(2,89); //-> At index 2, set value to 89
        System.out.println(variable_name);

        // Getting values at different indexes
        for (int i = 0; i <4 ; i++) {
            System.out.println(variable_name.get(i));
        }

        // Removing items
        variable_name.remove(2); //-> index 2 value will be removed
        System.out.println(variable_name);
    }
}
