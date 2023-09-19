import java.util.Scanner;
/*To find out whether the given String is Palindrome or not.*/
public class Q_08_palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string to check for palindrome: ");
        String userStr = input.next();
        String reversedStr = "";
        for(int i = 0;i<userStr.length();i++){
            reversedStr = userStr.charAt(i) + reversedStr;
        }
        System.out.println(reversedStr);
    }
}
