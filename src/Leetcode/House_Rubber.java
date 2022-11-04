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
        
        //Approach2, using 1d dp, T.C : O(n), S.C : O(1)
        //base case
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        //Initialize an arrays to store the money
	    int[] dp = new int[nums.length];

        //We can infer the formula from problem:mark[i]=max(num[i]+mark[i-2],mark[i-1])
        //so initialize two nums at first.
	    dp[0] = nums[0];
	    dp[1] = Math.max(nums[0], nums[1]);

        //Using Dynamic Programming to mark the max money in loop.
	    for(int i=2;i<nums.length;i++){
		    dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
	    }
	    return dp[nums.length-1];
        
        /*
        //Approach3, T.C : O(n), S.C : O(1)
        int curMax = 0;
        int preMax = 0;
        for(int num: nums) {
            int temp = curMax;
            curMax = Math.max(num+preMax, curMax);
            preMax = temp;
        }

        return curMax;
        */
    }
}
