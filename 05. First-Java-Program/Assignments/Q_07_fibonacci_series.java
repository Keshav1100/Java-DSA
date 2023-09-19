import java.util.Scanner;

public class Q_07_fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n up-to which you need value of fibonacci series: ");
        int userN = input.nextInt();
        int first = 0;
        int second = 1;
        if(userN >=1){
            System.out.print(first + " ");
        }
        if (userN >= 2) {
            System.out.print(second + " ");

        }

        for(int n =  3;n<=userN;n++){
            int next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
        }


    }
}
