import java.util.ArrayList;

public class Maze1 {
    public static void main(String[] args) {
        System.out.print("No. of ways possible: ");
        System.out.println(countPaths(3, 3));
        System.out.println("Paths possible: ");
        printPaths("", 3, 3);
        System.out.println("List of paths possible: ");
        System.out.println(arrayOfPaths("", 3, 3));
        System.out.println("List of paths possible (including " +
                "diagonal): ");
        System.out.println(arrayOfPathsDiagonal("",3,3));
        System.out.println("List of paths possible (avoiding " +
                " obstacles: ");
        boolean[][] mazeObstacle = new boolean[][]{
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        System.out.println(arrayOfPathsObstacle("",mazeObstacle,
                0,0));
    }

    // Getting total number of pathways to reach from start to
    // end
    public static int countPaths(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = countPaths(r - 1, c);
        int right = countPaths(r, c - 1);
        return left + right;
    }

    // Printing the pathways possible to go from start to end
    public static void printPaths(String path, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(path);
            return;
        }
        if (r > 1) {
            printPaths(path + 'D', r - 1, c);
        }
        if (c > 1) {
            printPaths(path + 'R', r, c - 1);
        }
    }

    // Returning an ArrayList consisting of all possible paths
    public static ArrayList<String> arrayOfPaths(
            String path, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> way = new ArrayList<>();
            way.add(path);
            return way;
        }
        ArrayList<String> totalWays = new ArrayList<>();
        if (r > 1) {
            totalWays.addAll(arrayOfPaths(
                    path + 'D', r - 1, c));
        }
        if (c > 1) {
            totalWays.addAll(arrayOfPaths(
                    path + 'R', r, c - 1));
        }
        return totalWays;
    }

    // Returning an ArrayList consisting of all possible paths
    // (diagonal including):
    public static ArrayList<String> arrayOfPathsDiagonal(
            String path, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> way = new ArrayList<>();
            way.add(path);
            return way;
        }
        ArrayList<String> totalWays = new ArrayList<>();
        if(r>1 && c>1){
            totalWays.addAll(arrayOfPathsDiagonal(path+'V',r-1,c-1));
        }
        if (r > 1) {
            totalWays.addAll(arrayOfPathsDiagonal(
                    path + 'D', r - 1, c));
        }
        if (c > 1) {
            totalWays.addAll(arrayOfPathsDiagonal(
                    path + 'R', r, c - 1));
        }

        return totalWays;
    }
    // Returning an ArrayList consisting of all possible paths
    // (avoiding obstacles):
    public static ArrayList<String> arrayOfPathsObstacle(
            String path,boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            ArrayList<String> way = new ArrayList<>();
            way.add(path);
            return way;
        }
        ArrayList<String> totalWays = new ArrayList<>();
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        if(r<maze.length-1 && c<maze[0].length-1){
            totalWays.addAll(arrayOfPathsObstacle(path+'V',
                    maze,r+1,c+1));
        }
        if (r < maze.length-1) {
            totalWays.addAll(arrayOfPathsObstacle(
                    path + 'D',maze, r + 1, c));
        }
        if (c <maze[0].length-1) {
            totalWays.addAll(arrayOfPathsObstacle(
                    path + 'R',maze, r, c + 1));
        }

        return totalWays;
    }
}