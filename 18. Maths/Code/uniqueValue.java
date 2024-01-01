public class uniqueValue {
    public static void main(String[] args) {
        int[] arr = {9,9,6,8,6,8,2,5,5};
        System.out.println(checkUnique(arr));
    }
    public static int checkUnique(int[] arr){
        int unique = 0;
        for (int a:arr) {
            unique^=a;
        }
        return unique;
    }
}
