/*Write a program to print whether a number is even or odd, also take input from the user.*/
import java.util.Scanner;

public class Q_01_odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = input.nextInt();
        if(userInput == 0){
            System.out.println("0 is even.");
        }
        else if(userInput%2 == 0){
            System.out.println(userInput+" is even.");

        } else if (userInput%2 != 0) {
            System.out.println(userInput+" is odd.");
        }
    }
}
