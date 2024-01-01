import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        System.out.print("Enter the number: ");
*/
/*
        int num = input.nextInt();
        System.out.println(isPrime(num));
*/
/*
        int num = input.nextInt();
        System.out.println(isArmstrong(num));
*/
        /* Task 3: To print all the 3-digit armstrong numbers */
        for(int i = 100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    /* To check if a number is prime or not */
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while (c*c<=n) {
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
    /* To print all the 3 digit armstrong numbers */
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            float rem = n%10;
            sum += (rem*rem*rem);
            n/=10;
        }
        return sum == original;
    }
}

/* Completed methods*/

