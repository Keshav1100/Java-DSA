public class StringPermutations_3 {
    public static void main(String[] args) {
        // Count the number of permutations for a given string
        String sample = "abc";
        System.out.println(strPerCount("",sample));
    }
    public  static int strPerCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1; i++) {
            String start = p.substring(0,i);
            String end = p.substring(i);
            count+= strPerCount(start+ch+end,up.substring(1));

        }
        return count;
    }
}
