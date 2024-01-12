package Patterns;

public class Triangle1 {
    public static void main(String[] args) {
triangle1(4,0);
triangle2(4,0);
    }
    static void triangle1(int row,int col){
        if(row<0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            triangle1(row,++col);
        }
        else{
            System.out.println();
            triangle1(--row,0);
        }


    }
    static void triangle2(int row,int col){
        if(row<0){
            return;
        }
        if(col<row){
            triangle2(row,++col);
            System.out.print("* ");
        }
        else{
            triangle2(--row,0);
            System.out.println();
        }


    }
}
