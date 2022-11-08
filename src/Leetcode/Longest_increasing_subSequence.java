package Leetcode;
import java.util.*;
public class Longest_increasing_subSequence {
    public int lengthOfLIS(int[] nums) {
        //Approach1, using binarySearch, T.C : O(nlogn), S.C : (n)
        int[] dp = new int[nums.length];
        int len = 0;
        
        for(int x:nums){
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i<0) i = -(i+1);
            dp[i] = x;
            
            if(i==len) len++;
        }
        return len;
    }
}
