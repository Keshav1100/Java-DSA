import java.util.Scanner;
/*Take value in Rupees and give the usd value*/
/*Rs 1 = 0.012 USD at this time*/
public class Q_06_rs_to_usd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value in Rupees: ");
        float rupeeValue = input.nextFloat();
        System.out.print("Rs. "+rupeeValue+" = " +(rupeeValue*0.012)+"USD");

    }
}
