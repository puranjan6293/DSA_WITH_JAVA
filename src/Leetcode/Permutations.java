package Leetcode;
import java.util.*;
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // Arrays.sort(nums); // not necessary
        backtrack(ans, new ArrayList<>(), nums);
        return ans;
    }
    static void backtrack(List<List<Integer>> ans, List<Integer> comb, int[] nums){
        if(comb.size()==nums.length){
            ans.add(new ArrayList<>(comb));
        }
        for(int i=0;i<nums.length;i++){
            if(comb.contains(nums[i])){ // element already exists, skip
                continue;
            }
            //add element to comb
            comb.add(nums[i]);
            //call recursion
            backtrack(ans, comb, nums);
            //remove element from comb
            comb.remove(comb.size()-1);
            
        }
    }
}
