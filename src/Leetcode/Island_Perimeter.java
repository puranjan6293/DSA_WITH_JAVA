package Leetcode;

public class Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        int totalSum = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    totalSum+=perimeter(i, j, grid);
                }
            }
        }
        return totalSum;
    }
    public int perimeter(int i, int j, int[][] grid) {
        int sum = 4; //if the current cell doesnt have any neighbours
        // decrementing sum if there is a valid neighbour around the current cell
        if (i - 1 >= 0 && grid[i - 1][j] == 1) sum--;
        if (i + 1 < grid.length && grid[i + 1][j] == 1) sum--;
        if (j - 1 >= 0 && grid[i][j - 1] == 1) sum--;
        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) sum--;
        return sum;
    }
}
