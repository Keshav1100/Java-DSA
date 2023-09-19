import java.util.Scanner;
/*Take in 2 numbers and print the largest.*/
public class Q_05_largest_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float firstNum = input.nextFloat();
        System.out.print("Enter second number: ");
        float secondNum = input.nextFloat();
        if(firstNum>secondNum){
            System.out.println(firstNum+" is largest.");
        }else if(firstNum<secondNum){
            System.out.println(secondNum+" is largest.");
        }else if(firstNum==secondNum){
            System.out.println("Both numbers are equal");
        }
        else{
            System.out.println("There has been some error.");
        }
    }
}
