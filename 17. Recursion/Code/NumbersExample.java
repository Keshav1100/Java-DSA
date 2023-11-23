public class NumbersExample {
    /*
    Important Points:-
    1. Whenever a function is called, until execution gets over, it stays
       in stack.
    2. A function execution gets over -> it's removed from stack -> the
       flow of program returns to where that function was called.

     Base Condition: Condition when the function stop calling itself.
                     If not given -> Stackoverflow error will come, as the
                     functions present in stack will eat up the memory.

    Uses of recursion:
        1. Bigger/Complex problems -> solve in simpler way.
        2. Recursion solution <=> Iterative Solution
        3. Space Complexity -> As recursive calls made => Not constant
     */
    public static void main(String[] args) {
        printN(1);
    }
    public static void printN(int n){
        // Base Condition:
        if(n == 10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        printN(n+1);
    }
}
