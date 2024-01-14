public class Ques_2 {
    // Given a string u have to return a string in which all the
    // instances of a specified substring are removed.
    public static void main(String[] args) {
    String sample = "things do not happen. they are made to happen";
    String toRemove = "happen";
        System.out.println("Result:");
        System.out.println(skipString(toRemove,sample));
    }
    public static String skipString(String check, String original){
        if(original.isEmpty()){
            return "";
        }
        char ch = original.charAt(0);
        String ans;
        if(original.startsWith(check)){
            ans = skipString(check,original.substring(check.length()));
        }
        else{
            ans = ch + skipString(check,original.substring(1));
        }
        return ans;
    }
}
