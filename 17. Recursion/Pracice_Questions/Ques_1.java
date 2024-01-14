public class Ques_1 {
    // Given a string u have to return a string in which all the
    // instances of a specified character are removed.
    public static void main(String[] args) {
        String sample = "a nice chair";
        System.out.println("Method 1 result: ");
        skipChar1("",sample);
        System.out.println("Method 2 result: ");
        System.out.println(skipChar2(sample));
    }
    // Method 1: passing the ans in the argument
    public static void skipChar1(String ans,String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = original.charAt(0);
        if(ch=='a'){
            skipChar1(ans,original.substring(1));
        }
        else{
            skipChar1(ans+ch,original.substring(1));
        }
    }
    // Method 2: not passing the ans in the argument
    public static String skipChar2(String original){
        if(original.isEmpty()){
            return "";
        }
        char ch = original.charAt(0);
        String ans;
        if(ch=='a'){
            ans = skipChar2(original.substring(1));
        }
        else{
            ans = ch + skipChar2(original.substring(1));
        }
        return ans;
    }
}
