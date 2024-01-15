public class StringPermutations_1 {
    public static void main(String[] args) {
        // Print all the permutations of a given string
        String sample = "abc";
        strPer("",sample);
    }
    public  static  void strPer(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1; i++) {
            String start = p.substring(0,i);
            String end = p.substring(i,p.length());
            strPer(start+ch+end,up.substring(1));
        }
    }
}
