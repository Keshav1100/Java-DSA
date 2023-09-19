import java.util.Scanner;

public class Q_09_armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start of range in which you want to find armstrong number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the end of range in which you want to find armstrong number: ");
        int secondNum = input.nextInt();
        for(int i = firstNum;i<=secondNum;i++){
            int digit = i;
            String digitLength = String.valueOf(digit);
            double sum = 0;
            while(digit>0){
                int num = digit%10;
                sum += Math.pow(num,digitLength.length());
                digit/=10;
            }
/*
            System.out.println(i+" "+ " "+(int)sum);
*/
            if(i == (int)sum){
                System.out.print(i+" ");
            }
        }
    }
}
