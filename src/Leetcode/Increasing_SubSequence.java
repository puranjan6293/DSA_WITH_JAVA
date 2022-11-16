package Leetcode;
import java.util.*;
public class Increasing_SubSequence {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        backtrack(nums, ans, new ArrayList<>(), 0);
        return ans;
    }
    void backtrack(int[] nums, List<List<Integer>> ans, List<Integer>temp, int curr){
        //base case
        if(curr==nums.length){
            if(temp.size()>1){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        
        //not pick option
        if(curr==0 || temp.isEmpty() || temp.get(temp.size()-1)!=nums[curr]){
            backtrack(nums, ans, temp, curr+1);
        }
        
        //pick condition
        if(temp.isEmpty() || temp.get(temp.size()-1)<=nums[curr]){
            //add in temp array
            temp.add(nums[curr]);
            backtrack(nums, ans, temp, curr+1);
            //remove element from temp
            temp.remove(temp.size()-1);
        }
    }
}
