package Leetcode;

public class max_consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int cur=0;
        int max=0;
        int i=0;
        int j=0;
        while(i<n){
            while(i<n && nums[i]!=1)
                i++;
            j=i;
            while(j<n && nums[j]==1)
                j++;
            cur=j-i;
            max=Math.max(cur,max);
            i=j;
        }
        return max;
    }
}
