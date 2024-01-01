public class uniqueElement {
    public static void main(String[] args) {
        int[] arr = {2,2,3,7,7,2,8,8,7,8};
        System.out.println(uniqueElem(arr));

    }
    public static int uniqueElem(int[] arr){
        int bitSum = 0;
        for (int i = 0; i < arr.length; i++) {
            bitSum+=(Integer.parseInt(Integer.toBinaryString(arr[i])));
        }
        System.out.println(bitSum);
        System.out.println(bitSum%3);
        //return Integer.parseInt(String.valueOf((bitSum%3)), 2);
return 1;
    }

}
