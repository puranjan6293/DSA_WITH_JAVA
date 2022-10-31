package Leetcode;
import java.util.*;
public class ThreeSum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        //using twopointers
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            int left = i+1;
            int right = nums.length-1;
            
            while(left<right){
                //three sum
                int sum = nums[i]+nums[left]+nums[right];
                
                //Math.abs because of closest sum
                if(Math.abs(target-sum)<Math.abs(diff)){
                    diff = target-sum;
                }
                
                //common conditions of twopointers
                if(sum<target) left++;
                else right--;
            }
        }
        return (target-diff);
    }
}
