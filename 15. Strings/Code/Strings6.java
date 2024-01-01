public class Strings6 {
    public static void main(String[] args) {
        StringBuilder alphabets = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            alphabets.append((char)('a' +i));
        }
        System.out.println(alphabets.toString());
    }
}
