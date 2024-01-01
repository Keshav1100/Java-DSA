public class Strings7 {
    public static void main(String[] args) {
        String check = null;
        System.out.println(palindromeCheck(check));
    }
    public static boolean palindromeCheck(String str){
        if(str == null){
            return false;
        }
        int start = 0;
        int end = str.length()-1;
        while (start<=end){
            if(str.toLowerCase().charAt(start)==str.toLowerCase().charAt(end)){
                start+=1;
                end-=1;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
