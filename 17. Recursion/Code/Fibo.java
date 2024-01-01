public class Fibo {
    /*
    Fibonacci Sequence : 1 1 2 3 5 8 13 ....

     */
    public static void main(String[] args) {
        // System.out.println(Fibonacci(50)); -> will not work, exponential time complexity, its 1.6 raise to something and not 2^n
        // System.out.println(Fibonacci(5));
        for (int i = 0; i < 11; i++) {
            System.out.println(newFibonacci(i));
        }
    }

    public static int newFibonacci(int i){
        return (int)( Math.pow( (1+Math.sqrt(5))/2 ,i ) / Math.sqrt(5));
    }


    public static int Fibonacci(int n){
        // Base Condition:
        if(n==1 || n==0){
            return 1;
        }
        else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
