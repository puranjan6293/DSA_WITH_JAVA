package Leetcode;
import java.util.*;
public class permutation_anyOrder {
    //Approach, using backtracking, T.C : O(nlogn), S.C : O(n)
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums); //here sort is necessary
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, new boolean[nums.length]);
        return ans;
    }
    static void backtrack(List<List<Integer>> ans, List<Integer> comb, int[] nums, boolean[] visited){
        if(comb.size()==nums.length){
            ans.add(new ArrayList<>(comb));
        }
        else{
            for(int i=0;i<nums.length;i++){
                //remove duplicates
                if(visited[i] || (i>0 && nums[i]==nums[i-1] &&!visited[i-1])){
                    continue;
                }
                comb.add(nums[i]);
                visited[i] = true;
                backtrack(ans, comb, nums, visited);
                visited[i] = false;
                comb.remove(comb.size()-1);
            }
        }
    }
}
