package Leetcode;
import java.util.*;
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return ans;
        backtrack(nums, ans, new ArrayList<>(), 0);
        return ans;
        
    }
    void backtrack(int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp, int idx){
        //base case
        if(idx>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        //case1, we pick the element
        temp.add(nums[idx]); //add element
        backtrack(nums, ans, temp, idx+1); //call recursion for move ahed
        temp.remove(temp.size()-1); //remove from the last
        
        //case2, we dont pick the element
        //( notice, we did not add the current element in our temporary list )
        backtrack(nums, ans, temp, idx+1);
    }
}
