public class Patterns1 {
    /*
    How to approach?
    1. no. of lines = no. of rows = no. times outer loop will run.
    2. Identify for each row:
        -> No. of columns for each row
        -> Type of values/elements in the row
    3. What do u need to print?.
    NOTE: Try to find the formulae relating rows and columns

     */
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern17(5);
        pattern28(5);
        pattern30(5);
        pattern31(4);

    }
    public  static void pattern1(int n){
        /*
        Pattern:
        *****
        *****
        *****
        *****
        *****
         */
        System.out.println("Pattern - 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
        // When one row is complete we need to add one new line.
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern2(int n){
        /*
        Pattern:
        *
        **
        ***
        ****
        *****
        */
        System.out.println("Pattern - 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void pattern3(int n){
        /*
        Pattern:
        *****
        ****
        ***
        **
        *
        */
        System.out.println("Pattern - 3");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void pattern4(int n){
        /*
        Pattern:
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
        System.out.println("Pattern - 4");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void pattern5(int n){
        /*
        Pattern:
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
        */
        System.out.println("Pattern - 5");
        for (int i = 0; i < 2*n; i++) {
            if(i>n){
                for (int j = 0; j < 2*n-i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                // cols = 1 in this case
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
    public static void pattern6(int n){
        /*
        Pattern:
             *
            **
           ***
          ****
         *****
        */
        System.out.println("Pattern - 6");
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n-i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void pattern7(int n){
        /*
        Pattern:
            *****
             ****
              ***
               **
                *
        */
        System.out.println("Pattern - 7");
        for (int i = 0; i < n; i++) {

            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void pattern8(int n){
        /*
        Pattern:
             *
            ***
           *****
          *******
         *********
        */
        System.out.println("Pattern - 8");
        for (int i = 0; i < n; i++) {

        }
        System.out.println();

    }
    public static void pattern28(int n){
        /*
        Pattern:
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
        */
        System.out.println("Pattern - 28");
        for (int i = 0; i < 2*n; i++) {
            int cols = i>n?2*n-i:i;
            int totalSpaces =n- cols;
            for (int space = 0; space < totalSpaces; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();

            }
    }
    public static void pattern30(int n){
        /*
        Pattern:
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
        */
        System.out.println("Pattern - 30");
        for (int i = 1; i <= n; i++) {
            int totalSpaces = n-i;
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
    public static void pattern17(int n){
        /*
        Pattern:
         1
        212
       32123
      4321234
       32123
        212
         1
        */
        System.out.println("Pattern - 17");
        for (int i = 0; i < 2*n; i++) {
            int cols = i>n?2*n-i:i;
            for (int space = 0; space < n-cols; space++) {
                System.out.print("  ");
            }
            for (int j = cols; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int k = 2; k <=cols ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }


    }
    public static void pattern31(int n){
        /*
        Pattern:
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
         */
        System.out.println("Pattern - 31");
        int N = 2*n;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                int indexValue =n- Math.min(Math.min(i,j),Math.min(N-i,N-j));
                System.out.print(indexValue+" ");
            }
            System.out.println();
        }

    }
}
