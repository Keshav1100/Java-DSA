import java.util.Objects;
import java.util.Scanner;

/*Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)*/
public class Q_04_basic_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float firstNum = input.nextFloat();
        System.out.print("Enter second number: ");
        float secondNum = input.nextFloat();
        System.out.print("Enter an operator (+,-,*,/): ");
        String oper = input.next();
        if(Objects.equals(oper, "+")){
            System.out.println(firstNum+" + "+secondNum +" = "+(firstNum+secondNum));
        }
        else if(Objects.equals(oper, "-")) {
            System.out.println(firstNum+" - "+secondNum +" = "+(firstNum-secondNum));
        }else if(Objects.equals(oper, "*")) {
            System.out.println(firstNum+" * "+secondNum +" = "+(firstNum*secondNum));
        }else if(Objects.equals(oper, "/")) {
            System.out.println(firstNum+" / "+secondNum +" = "+(firstNum/secondNum));
        }
        else{
            System.out.println("There has some wrong input.");
        }

    }
}
