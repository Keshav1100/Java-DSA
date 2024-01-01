public class Strings5 {
    public static void main(String[] args) {
        String alphabets = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            // this is creating a new string object everytime and so wasting
            // the space taken by previous objects.
            // So its better to use StringBuilder object as it is mutable.
            System.out.println(ch);
            alphabets+=ch;
        }
        System.out.println(alphabets);
    }
}
