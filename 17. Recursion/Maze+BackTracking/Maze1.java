import java.util.ArrayList;

public class Maze1 {
    public static void main(String[] args) {
        System.out.print("No. of ways possible: ");
        System.out.println(countPaths(3,3));
        System.out.println("Paths possible: ");
        printPaths("",3,3);
        System.out.println("List of paths possible: ");
        System.out.println(arrayOfPaths("",3,3));
    }
    // Getting total number of pathways to reach from start to
    // end
    public static int countPaths(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = countPaths(r-1,c);
        int right = countPaths(r,c-1);
        return left +right;
    }
    // Printing the pathways possible to go from start to end
    public  static void printPaths(String path,int r,int c){
        if(r==1 && c==1){
            System.out.println(path);
            return;
        }
        if(r>1){
            printPaths(path+'D',r-1,c);
        }
        if(c>1){
            printPaths(path+'R',r,c-1);
        }
    }
    // Returning an ArrayList consisting of all possible paths
    public static ArrayList<String> arrayOfPaths(
            String path,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> way = new ArrayList<>();
            way.add(path);
            return way;
        }
        ArrayList<String> totalWays = new ArrayList<>();
        if(r>1){
            totalWays.addAll(arrayOfPaths(
                    path+'D',r-1,c));
        }
        if(c>1){
            totalWays.addAll(arrayOfPaths(
                    path+'R',r,c-1));
        }
        return totalWays;
    }
}
