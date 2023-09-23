package Assignments;

import java.math.BigDecimal;
import java.util.Scanner;

public class IntermediateJavaPrograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*
        Intermediate Java Programs
*/
/*
        1. Factorial Program In Java
        System.out.print("Enter the number: ");
        int user = input.nextInt();
        int fac = 1;
        if(user>1){
            for (int i = 2;i<=user;i++){
                fac = fac*i;
            }
            System.out.println("Factorial of "+user+" = "+fac);

        } else if (user==1 || user ==0) {
            System.out.println("Factorial of "+user+" = "+user);
        }
*/
/*
        2. Calculate Electricity Bill
        System.out.print("Enter the number of units consumed: ");
        float units = input.nextFloat();
        double totalBill;
        if (units<=50){
            totalBill = units*0.5;
        } else if (units<=150) {
            totalBill =25+ (units-50)*0.75;
        }
         else if (units<=250) {
            totalBill =100+ (units-150)*1.2;
        }
         else  {
            totalBill =220+ (units-250)*1.5;
        }
        System.out.println("The total electricity bill = Rs. "+totalBill);
*/
/*
        3. Calculate Average Of N Numbers
        System.out.print("Enter the total no. of numbers you want to enter: ");
        int userN = input.nextInt();
        int count = 0;
        float sum = 0;
        while(userN>count){
            System.out.print("Enter the number: ");
            int userNum = input.nextInt();
            sum += userNum ;
            count++;
        }
        System.out.println("The average of numbers you entered = "+sum/userN);
*/
/*
        4. Calculate Discount Of Product
        System.out.print("Enter the price of product: ");
        float price = input.nextFloat();
        System.out.print("Enter the discount (in %): ");
        float disc = input.nextFloat();
        System.out.println("The discount on the product = Rs. "+(disc*price)/100);
*/
/*
        5. Calculate Distance Between Two Points
        System.out.print("Enter x-coordinate of point 1: ");
        float x1 = input.nextFloat();
        System.out.print("Enter y-coordinate of point 2: ");
        float y1 = input.nextFloat();
        System.out.print("Enter x-coordinate of point 1: ");
        float x2 = input.nextFloat();
        System.out.print("Enter y-coordinate of point 2: ");
        float y2 = input.nextFloat();
        System.out.println("The distance between the points = "+(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)))+" units.");
*/
/*
        6. Calculate Commission Percentage
        System.out.print("Enter the price: ");
        float price = input.nextFloat();
        System.out.print("Enter the commission (in %): ");
        float com = input.nextFloat();
        System.out.println("The commission = Rs. "+(com*price)/100);
*/
/*
        7. Power In Java
        System.out.print("Enter the base number: ");
        double base = input.nextDouble();
        System.out.print("Enter the power: ");
        int exponent = input.nextInt();
        double result = 1.0;
        for(int i = 0;i<Math.abs(exponent);i++){
            result*=base;
        }

        if(exponent<0){
            result = 1/result;
        } else if (exponent == 0) {
            result = 1;
        }
        System.out.println("("+base+") ^ "+exponent+" = "+result);
*/
/*
        8. Calculate Depreciation of Value
        System.out.print("Enter the present price: ");
        float price = input.nextFloat();
        System.out.print("Enter the annual depreciation (in %): ");
        float dep = input.nextFloat();
        System.out.println("The value depreciated = Rs. "+(dep*price)/100);
*/

/*
        9. Calculate Batting Average
        System.out.print("Enter the total runs scored: ");
        int runs = input.nextInt();
        System.out.print("Enter the no. of times player is dismissed: ");
        int dismissed = input.nextInt();
        if(dismissed>0){
            System.out.println("The batting average of the player = "+runs/dismissed);
        }
        else{
            System.out.println("The batting average of player = NA (The player has not been dismissed)");
        }
*/
/*
       10. Calculate CGPA Java Program
        System.out.print("Enter the number of courses: ");
        int numCourses = input.nextInt();
        double totalCredits = 0.0;
        double totalCreditHours = 0.0;
        for (int i = 0;i<numCourses;i++){
            System.out.println("Course " + (i+1) + ":");

            System.out.print("Enter the grade (A, A-, B+, B, B-, C+, C, C-, D, F): ");
            String grade = input.next();

            System.out.print("Enter the credit hours: ");
            int creditHours = input.nextInt();
            double gradePoint = switch (grade) {
                case "A" -> 4.0;
                case "A-" -> 3.7;
                case "B+" -> 3.3;
                case "B" -> 3.0;
                case "B-" -> 2.7;
                case "C+" -> 2.3;
                case "C" -> 2.0;
                case "C-" -> 1.7;
                case "D" -> 1.0;
                case "F" -> 0.0;
                default -> 0.0;
            };
            totalCredits += (gradePoint*creditHours);
            totalCreditHours += creditHours;
        }
        double cgpa = totalCredits/totalCreditHours;
        System.out.println("CGPA: "+ cgpa);
*/
/*
       11. Compound Interest Java Program
        System.out.print("Enter the principal amount (in Rs.): ");
        BigDecimal principal = input.nextBigDecimal();
        System.out.print("Enter the annual rate of interest (in %): ");
        BigDecimal rate = input.nextBigDecimal();
        System.out.print("Enter the no. of times interest is compounded every year: ");
        int n = input.nextInt();
        System.out.print("Enter the time period (in years): ");
        BigDecimal yr = input.nextBigDecimal();
        BigDecimal compoundInterest =((principal.multiply(BigDecimal.valueOf(Math.pow((1+(rate.doubleValue()/n)),n*yr.doubleValue()))))).subtract(principal);
        System.out.printf("Compound Interest = Rs. %.2f",compoundInterest);

*/
/*
       12. Calculate Average Marks
        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();
        double totalMarks = 0.0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = input.nextDouble();
            totalMarks += marks;
        }

        double average = totalMarks / numSubjects;
        System.out.println("Average Marks: " + average);
*/
/*
       13. Sum Of N Numbers
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
*/
/*
       14. Armstrong Number In Java
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
*/
/*
       15. Find Ncr & Npr
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        System.out.print("Enter the value of r: ");
        int r = input.nextInt();

        // Calculate nCr and nPr without helper methods
        int nCr = 1;
        int nPr = 1;

        // Calculating n!
        for (int i = 1; i <= n; i++) {
            nCr *= i;
        }

        // Calculating (n-r)!
        int nMinusRFactorial = 1;
        for (int i = 1; i <= n - r; i++) {
            nMinusRFactorial *= i;
        }

        // Calculating r!
        int rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        // Calculating nCr and nPr
        nCr /= (nMinusRFactorial * rFactorial);
        nPr /= nMinusRFactorial;

        System.out.println("nCr (" + n + " choose " + r + ") = " + nCr);
        System.out.println("nPr (" + n + " permute " + r + ") = " + nPr);
*/
/*
       16. Reverse A String In Java
        System.out.print("Enter a string: ");
        String UserIn = input.nextLine();
        String reversed = "";

        // Reverse the string without using a helper method
        for (int i = UserIn.length() - 1; i >= 0; i--) {
            reversed += UserIn.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
*/
/*
       17. Find if a number is palindrome or not
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int originalNum = num;
        int reversedNum = 0;

        // Check if the number is a palindrome without using a helper method
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
*/
/*
       18. Future Investment Value
*/
/*
       19. HCF Of Two Numbers Program
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        // Calculate future investment value
        double futureValue = principal * Math.pow(1 + (annualRate / 100), years);

        System.out.println("Future Investment Value: Rs." + futureValue);
*/
/*
       20. LCM Of Two Numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int max;
    if(num1>num2){
        max= num1;
    }
    else{
        max = num2;
    }

        int lcm = max;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm += max;
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
*/
/*
       21. Java Program Vowel Or Consonant
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid character.");
        }
*/
/*
       22. Perfect Number In Java
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
*/
/*
       23. Check Leap Year Or Not
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
*/
/*
       24. Sum Of A Digits Of Number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
*/
/*
       25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
        int daysInAugust = 31;
        int outingCount = 0;


        for (int day = 1; day <= daysInAugust; day++) {
            if (day % 2 == 0) {
                outingCount++;
            }
        }

        System.out.println("Kunal can go out on " + outingCount + " even days in August.");
*/
/*
       26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter a list of numbers (enter 0 to terminate):");

        while (true) {
            int num = input.nextInt();

            if (num == 0) {
                break; // Terminate the loop if the user enters 0
            } else if (num < 0) {
                sumNegative += num;
            } else if (num % 2 == 0) {
                sumPositiveEven += num;
            } else {
                sumPositiveOdd += num;
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
*/
/*

    Completed Intermediate Java Program Assignment
*/
    }
}
