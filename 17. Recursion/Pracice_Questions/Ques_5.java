import java.util.ArrayList;

public class Ques_5 {
    // Print an ArrayList of all the subsequences (along with its
    // ascii values) of a given string
    public static void main(String[] args) {
        System.out.println(subSeqASCII("","abc"));
    }
    public static ArrayList<String> subSeqASCII(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> subseq = new ArrayList<>();
            subseq.add(processed);
            return subseq;
        }

        char ch = unprocessed.charAt(0);
        ArrayList<String> first = subSeqASCII(processed+ch,unprocessed.substring(1));
        ArrayList<String> second = subSeqASCII(processed +(ch+0),unprocessed.substring(1));
        ArrayList<String> third = subSeqASCII(processed,unprocessed.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
