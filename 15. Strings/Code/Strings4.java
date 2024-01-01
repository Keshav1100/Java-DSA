import java.util.ArrayList;

public class Strings4 {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // => 195 -> Java converts characters
        // into ASCII values and adds them. For strings, it performs
        // concatenation
        System.out.println("a" + "b"); // => ab -> Concatenates the strings
        System.out.println('a'+4); // => 101 -> ASCII value of a + 4 ,
        // so if we typecast it to char , it'll give char value of 101
        // ASCII code
        System.out.println((char)('a'+4));

        System.out.println("a" + 68); // => a1 -> For String + integer,
        // integer is converted to Integer class and toString method is
        // called
        System.out.println("hello"+new ArrayList<>()); // => hello[] -> For
        // this, since arraylist is initially empty so its toString method
        // is called which converts it to an empty list.
        System.out.println("hello2" + new int[3]);// => hello2{some hash code}
        // For strings + array, the array is printed in some hash code format
        // as if printed directly from toString method of java class and not
        // the Arrays class.
        // System.out.println(new ArrayList<>() + new Integer(67)); -> error
        // as in java "+" operator can be used for primitives only or for
        // complex objects provided that there is at least one string
        // object in between.
        System.out.println(new ArrayList<>()+" " + new Integer(67));


    }
}
