public class isEven {
    public static void main(String[] args) {
        int a = 64;
        System.out.println(checkEven(a));
    }
    public static boolean checkEven(int a){
        return (a&1) != 1;
    }
}
