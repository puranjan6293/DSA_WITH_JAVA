package Leetcode;
import java.util.*;
public class find_missing_number_in_a_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=1;i<=nums.length;i++){
            hs.add(i);
        }
        for(int j=0;j<nums.length;j++){
            if(hs.contains(nums[j])){
                hs.remove(nums[j]);
            }
        }
        ans.addAll(hs);
        return ans;
    }
}
