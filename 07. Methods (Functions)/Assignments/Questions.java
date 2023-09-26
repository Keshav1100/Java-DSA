import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/* Q-1.
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("The largest of the entered numbers: "+largestNum(a,b,c));
        System.out.println("The smallest of the entered numbers: "+smallestNum(a,b,c));
*/
/*  Q-2.
        int a = input.nextInt();
        if(isEvenOdd(a)){
            System.out.println(a+" is even.");
        }
        else{
            System.out.println(a+" is odd.");
        }
*/
/*  Q-3.
        int userAge = input.nextInt();
        if(isVoteEligible(userAge)){
            System.out.println("You can vote.");
        }
        else{
            System.out.println("Sorry! You cannot vote.");
        }*/
/*
    Q-4.
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a+" + "+b+" = "+sumOf2(a,b));
*/
/*
    Q-5.
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a+" * "+b+" = "+prodOf2(a,b));
*/
/*
    Q-6.
        circleInfo(input.nextInt());
*/
/*  Q-7
      int n = input.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is Prime.");
        }else{
            System.out.println(n+" is not Prime.");
        }*/
/*
    Q-8
        int userMark = input.nextInt();
        displayGrade(userMark);
*/
/*
    Q-9
        int num = input.nextInt();
        System.out.println("The factorial of "+num+" = "+Factorial(num));
*/
/*
    Q-10
        int num = input.nextInt();
        System.out.println(checkPalindrome(num));
*/
/*
    Q-12
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(isTriplet(a,b,c));
*/
/*
    Q-13
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        betweenPrime(num1,num2);
*/
/*
    Q-14
        int user = input.nextInt();
        System.out.println("Sum of first "+user+" natural numbers = "+sumOfN(user));
*/
    }


    /*
      1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    static int largestNum(int a,int b,int c){
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    static int smallestNum(int a,int b,int c){
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
*/
    /*
        2. Define a program to find out whether a given number is even or odd.

    static boolean isEvenOdd(int a){
        if(a%2==0 || a==0){
            return true;
        }
        else return false;
    }
*/
    /*
        3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    static boolean isVoteEligible(int a){
        if(a>=18){
            return true;
        }
        else return false;
    }
*/
    /*
        4. Write a program to print the sum of two numbers entered by user by defining your own method.
    static int sumOf2(int a, int b){
        return a+b;
    }
*/
    /*
        5. Define a method that returns the product of two numbers entered by user.
    static int prodOf2(int a, int b){
        return a*b;
    }
*/
    /*
        6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
    static void circleInfo(int r){
        System.out.println("The area of the circle of radius "+r+" units = "+(22*r*r)/7+" sq. units.");
        System.out.println("The circumference of the circle of radius "+r+" units = "+(2*22*r)/7+" units.");
*/
    /*
        7. Define a method to find out if a number is prime or not.
    static boolean isPrime(int n){
        int a = 2;
        while(a<=Math.sqrt(n)){
            if(n%a == 0){
                return false;
            }
            a++;
        }
        return true;
    }
*/
    /*
        8. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
         Marks        Grade
         91-100         AA
         81-90          AB
         71-80          BB
         61-70          BC
         51-60          CD
         41-50          DD
          <=40          Fail
    static void displayGrade(int marks){
        if(marks>=91 && marks<=100){
            System.out.println("AA");
        }
        else if(marks>=81 && marks<=90){
            System.out.println("AB");
        }
        else if(marks>=71 && marks<=80){
            System.out.println("BB");
        }
        else if(marks>=61 && marks<=70){
            System.out.println("BC");
        }
        else if(marks>=51 && marks<=60){
            System.out.println("CC");
        }
        else if(marks>=41 && marks<=50){
            System.out.println("CD");
        }
        else if(marks>=0 && marks<=40){
            System.out.println("DD");
        }
        else{
            System.out.println("Invalid marks input.");
        }
    }
*/
    /*
        9. Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
                4! = 1 * 2 * 3 * 4 = 24
                3! = 3 * 2 * 1 = 6
                2! = 2 * 1 = 2
                Also,
                    1! = 1
                    0! = 1
    static int Factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }
*/
    /*
        10. Write a function to find if a number is a palindrome or not. Take number as parameter.
    static boolean checkPalindrome(int n){
        int original = n;
        int reversed = 0;
        while(n>0){
            int rem = n%10;
            reversed = reversed*10+rem;
            n/=10;
        }
        return original==reversed;
    }
*/
    /*
        12. Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
    static boolean isTriplet(int a,int b,int c){
        for(int i =0;i<3;i++){
            int sum = a*a +b*b;
            if(sum == c*c){
                return true;
            }
            int temp = a;
            a = c;
            c = b;
            b = temp;
        }
        return false;
    }
*/
    /*
        13. Write a function that returns all prime numbers between two given numbers.
    static void betweenPrime(int a,int b){

        for(int i = a;i<=b;i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
*/
    /*
        14. Write a function that returns the sum of first n natural numbers.
    static int sumOfN(int n){
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        return sum;
    }
*/

}