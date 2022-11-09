package Leetcode;

public class Maximum_Avarage_Subarray {
    public double findMaxAverage(int[] nums, int k) {
        //Approach, using sliding window
        int n = nums.length;
        //base case
        if(n<k){
            return 0;
        }
        long maxSum = 0;
        
        //substring sum
        for(int i=0;i<k;i++){
            maxSum+=nums[i];
        }
        
        long windowSum = maxSum;
        for(int i=k;i<n;i++){
            windowSum+=nums[i]-nums[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum/1.0/k;
    }
}
