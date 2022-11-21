package Leetcode;
import java.util.*;
public class Slinding_window_maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //Approach1, using Deque, T.C : O(n)
        //base case 
        if(nums==null || k<=0){
            return new int[0];
        }
        int n = nums.length;
        int[] ans = new int[n-k+1];
        
        int ansIdx = 0;
        
        //store index
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            //remove number out of range k
            while(!q.isEmpty() && q.peek()<i-k+1){
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            // q contains index... r contains content
            q.offer(i);
            if(i>=k-1){
                ans[ansIdx++] = nums[q.peek()];
            }
        }
        return ans;
    }
}
