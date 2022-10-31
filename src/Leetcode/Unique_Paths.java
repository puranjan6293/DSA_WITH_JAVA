package Leetcode;

public class Unique_Paths {
    public int uniquePaths(int m, int n) {
        //Approach1, using DP
        int[][] dp = new int[m][n];
        
        //adding 1 in both m and n
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int j = 0;j<n;j++){
            dp[0][j] = 1;
        }
        
        //calculating 
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
        
        /*
        //Approach2, using recursion
        // base case
        if(m == 1 || n == 1) return 1;
        
		// move down
        int downMove = uniquePaths(m-1, n);
		// move right
        int rightMove = uniquePaths(m, n-1);
        
        return downMove + rightMove;
        */
    }
}
