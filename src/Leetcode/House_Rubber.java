package Leetcode;

public class House_Rubber {
    public int rob(int[] nums) {
        /*
        //Approach1, using dynamic programming, T.C : O(n), S.C : O(1)
        int[][] dp = new int[nums.length+1][2];
        for(int i=1;i<=nums.length;i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            dp[i][1] = nums[i-1]+dp[i-1][0];
        }
        return Math.max(dp[nums.length][0], dp[nums.length][1]);
        */
        
        //Approach2, T.C : O(n), S.C : O(1)
        int curMax = 0;
        int preMax = 0;
        for(int num: nums) {
            int temp = curMax;
            curMax = Math.max(num+preMax, curMax);
            preMax = temp;
        }

        return curMax;
    }
}
