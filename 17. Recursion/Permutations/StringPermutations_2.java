import java.util.ArrayList;

public class StringPermutations_2 {
    public static void main(String[] args) {
        String sample = "abc";
        System.out.println(strPer("",sample));
    }
    public  static ArrayList<String> strPer(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1; i++) {
            String start = p.substring(0,i);
            String end = p.substring(i);
            list.addAll(strPer(start+ch+end,up.substring(1)));

        }
        return list;
    }
}
