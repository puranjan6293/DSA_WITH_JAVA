package Leetcode;

public class Maximum_SubArray {
    public int maxSubArray(int[] nums) {
        //by kaden's algorithm
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0;i<len;i++){
            //prefix sum
            sum+=nums[i];
            max = Math.max(max, sum);
            
            //if at any point sum becomes negative then no point keeping it because 0 is obviously greater than negative, so just make your sum 0.
            if(sum<0) sum = 0;
        }
        return max;
    }
}
