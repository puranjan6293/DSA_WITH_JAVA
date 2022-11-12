package Leetcode;

public class Combination_Sum_iv {
    public int combinationSum4(int[] nums, int target) {
        //Approach, using recursion+memoization, T.C : O(target)
        Integer[] memo = new Integer[target + 1];
        return recurse(nums, target, memo);
    }
    
    public int recurse(int[] nums, int remain, Integer[] memo){
        
        //base cases
        if(remain < 0) return 0;
        if(memo[remain] != null) return memo[remain];
        if(remain == 0) return 1;
        
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += recurse(nums, remain - nums[i], memo);
        }
        
        memo[remain] = ans;
        return memo[remain];
    }
}
