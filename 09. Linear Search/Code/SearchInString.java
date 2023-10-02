public class SearchInString {
    public static void main(String[] args) {
        String empName = "Kunal";
        System.out.println(search1(empName,'a'));
    }
    static boolean search1(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
