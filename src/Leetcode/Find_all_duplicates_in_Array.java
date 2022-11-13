package Leetcode;
import java.util.*;
public class Find_all_duplicates_in_Array {
    public List<Integer> findDuplicates(int[] nums) {
        //Approach1, Using HashSet
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        for(int e:nums){
            if(!s.contains(e)){
                s.add(e);
            }
            else ans.add(e);
        }
        return ans;
    }
}
