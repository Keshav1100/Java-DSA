import java.util.Scanner;
/*Take name as input and print a greeting message for that particular name.*/
public class Q_02_greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = input.next();
        System.out.println("Greeting "+ userName.toUpperCase()+"! Hope so you have a nice day.");

    }
}
