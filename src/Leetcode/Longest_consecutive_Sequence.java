package Leetcode;
import java.util.*;
public class Longest_consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        //Approach, using HashSet, T.C : O(n)
        
        //base case
        if(nums==null || nums.length==0) return 0;
        
        int max = 0;
        //step1, add element in HashSet
        HashSet<Integer> hs = new HashSet<>();
        for(int e: nums){
            hs.add(e);
        }
        
        //step2, traverse through the array
        for(int i=0;i<nums.length;i++){
            int count = 1;
            
            //looking left
            int num = nums[i];
            while(hs.contains(--num)){
                count++;
                hs.remove(num);
            }
            
            //looking right
            num = nums[i];
            while(hs.contains(++num)){
                count++;
                hs.remove(num);
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
