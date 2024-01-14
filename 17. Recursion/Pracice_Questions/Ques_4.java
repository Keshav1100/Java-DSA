import java.util.ArrayList;

public class Ques_4 {
    // Print an ArrayList of all the subsequences of a given string
    public static void main(String[] args) {
        System.out.println(subSeq("","pqr"));
    }
    public static ArrayList<String> subSeq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> subseq = new ArrayList<>();
            subseq.add(processed);
            return subseq;
        }

        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subSeq(processed+ch,unprocessed.substring(1));
        ArrayList<String> right = subSeq(processed,unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
}
