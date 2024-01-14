public class Ques_3 {
    // Print all the subsequences of a given string
    public static void main(String[] args) {
        subSeq("","pqr");
    }
    public static void subSeq(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subSeq(processed+ch,unprocessed.substring(1));
        subSeq(processed,unprocessed.substring(1));
    }
}
