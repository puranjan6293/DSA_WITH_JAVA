package Leetcode;

public class Minimum_PathSum {
    public int minPathSum(int[][] grid) {
        /*
        //Approach1, DP
        int height = grid.length;
            int width = grid[0].length;
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    if(row == 0 && col == 0) grid[row][col] = grid[row][col];
                    else if(row == 0 && col != 0) grid[row][col] = grid[row][col] + grid[row][col - 1];
                    else if(col == 0 && row != 0) grid[row][col] = grid[row][col] + grid[row - 1][col];
                    else grid[row][col] = grid[row][col] + Math.min(grid[row - 1][col], grid[row][col - 1]);
                }
            }
            return grid[height - 1][width - 1];
            */
        //Approach2, Recursion
        int height = grid.length;
        int width = grid[0].length;
        return min(grid, height-1, width-1);
    }
    //min function, for finding the min
    static int min(int[][]grid, int row, int col){
        if(row == 0 && col == 0) return grid[row][col]; 
        // this is the exit of the recursion
            if(row == 0) return grid[row][col] + min(grid, row, col - 1); 
        // when we reach the first row, we could only move horizontally.
            if(col == 0) return grid[row][col] + min(grid, row - 1, col); 
        //when we reach the first column, we could only move vertically.
            return grid[row][col]+Math.min(min(grid, row-1, col), min(grid, row, col-1)); 
        /** we want the min sum path so we pick the cell with the less value */
    }
}
