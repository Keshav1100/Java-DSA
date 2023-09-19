import java.util.Scanner;

public class ClassWorks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
     Program to find largest of 3 numbers.

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = a;
        if(a<b){
            max = b;
        }
        else if(a<c){
            max=c;
        }
        System.out.println(max);
*/
/*
     Program to find largest of 3 numbers.
        char userIn = input.next().trim().charAt(0);
        if(userIn>='a' && userIn<='z'){
            System.out.println("Lowercase");
        }
        else if(userIn>='A' && userIn<='Z'){
            System.out.println("Uppercase");
        }
*/
/*
     Program to find fibonacci sequence's nth number.
        int n = input.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 2; i <= n; i++) {
            int temp = secondNum;
            secondNum = firstNum + secondNum;
            firstNum = temp;

        }
        System.out.println(firstNum);
*/
/*    Problem for counting the number of occurrences of "n" in any number
        int userN = input.nextInt();
        int userChoice = input.nextInt();
        int count = 0;
        while (userN>0){
            int rem = userN%10;
            if(rem== userChoice){
                count++;
            }
            userN /= 10;
        }
        System.out.println(count);
*/
/*    Problem for counting the number of occurrences of "n" in any number
*/
        int userN = input.nextInt();
        String revN = "";
        while (userN>0){
            int rem = userN%10;
            revN = revN + rem;
            userN /= 10;
        }
        System.out.println(revN);

    }
}
