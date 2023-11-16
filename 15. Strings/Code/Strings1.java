
public class Strings1 {
    public static void main(String[] args) {
    /*
    Let's see that how we check/compare Strings
        1. using == method
        2. using .equals() method
     */
    String name = "Keshav";
    String name2 = "Keshav";
    // Both of the above will be reference to same pool location in heap.
        // System.out.println(name == name2); // Even intellij is also giving warning
    // So if we just want to compare values then use .equals() method and if we want java to implicitly create a new object of same value string
        String name3 = new String("Keshav1");
        String name4 = new String("Keshav1");
        System.out.println(name3 == name4);// this is giving false as we have created 2 new objects outside pool in heap
        System.out.println(name3.equals(name4));// this is giving true as we are only checking the value
    }
}
