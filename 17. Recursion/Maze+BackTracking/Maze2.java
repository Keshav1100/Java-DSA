import java.util.ArrayList;
import java.util.Arrays;

public class Maze2 {
    public static void main(String[] args) {
        boolean[][] mazeObstacle = new boolean[][]{
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][] pathFollowed = new int[mazeObstacle.length][
                mazeObstacle[0].length];
        System.out.println(allPaths("",mazeObstacle,
                0,0));
        allPathsPrinting("",mazeObstacle,0,0,
                pathFollowed,1);
    }
    // Returning an ArrayList consisting of all possible paths
    // (avoiding obstacles):
    public static ArrayList<String> allPaths(
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
        maze[r][c] = false;
        if (r < maze.length-1) {
            //maze[r+1][c] = false;
            totalWays.addAll(allPaths(
                    path + 'D',maze, r + 1, c));
        }
        if (c < maze[0].length-1) {
            //maze[r][c+1] = false;
            totalWays.addAll(allPaths(
                    path + 'R',maze, r, c + 1));
        }
        if (c > 0) {
            totalWays.addAll(allPaths(
                    path + 'L',maze, r, c - 1));
        }
        if (r > 0) {
                totalWays.addAll(allPaths(
                     path + 'U',maze, r-1, c));
        }
        maze[r][c] = true;

        return totalWays;
    }


    // Printing an ArrayList consisting of all possible paths
    // (avoiding obstacles):
    public static void allPathsPrinting(
            String path,boolean[][] maze, int r, int c,
            int[][] pathFollowed,int stepCount) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            pathFollowed[r][c] = stepCount;

            for (int[] arr:
                 pathFollowed) {

            System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        pathFollowed[r][c] = stepCount;
        if (r < maze.length-1) {
            allPathsPrinting(
                    path + 'D',maze, r + 1, c,
                    pathFollowed,stepCount+1);
        }
        if (c < maze[0].length-1) {
            allPathsPrinting(
                    path + 'R',maze, r, c + 1,
                    pathFollowed,stepCount+1);
        }
        if (c > 0) {
            allPathsPrinting(
                    path + 'L',maze, r, c - 1,
                    pathFollowed,stepCount+1);
        }
        if (r > 0) {
            allPathsPrinting(
                    path + 'U',maze, r-1, c,
                    pathFollowed,stepCount+1);
        }
        maze[r][c] = true;
        pathFollowed[r][c] = 0;

        return;
    }
}
