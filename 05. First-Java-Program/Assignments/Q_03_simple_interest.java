import java.util.Scanner;

/*Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.*/
public class Q_03_simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        float principal = input.nextFloat();
        System.out.print("Enter the Time period (in years): ");
        int timePeriod = input.nextInt();
        System.out.print("Enter the Rate of interest (in %): ");
        float rate = input.nextFloat();
        float interest = (principal*rate*timePeriod)/100;
        System.out.println("Principal Amount = Rs. "+principal);
        System.out.println("Rate of Interest = "+rate+"%");
        System.out.println("Time Period = "+timePeriod+" year/s");
        System.out.println("Your Simple Interest for the above inputs = Rs. "+interest);
    }
}
