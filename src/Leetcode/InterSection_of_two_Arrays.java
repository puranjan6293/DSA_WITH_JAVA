package Leetcode;
import java.util.*;
public class InterSection_of_two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Brute force approach, using hashset
        HashSet<Integer> s = new HashSet<>();
        
        for(int e:nums1){
            s.add(e);
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int f:nums2){
            if(s.contains(f)){
                hs.add(f);
            }
        }
        int[] ans = new int[hs.size()];
        int idx = 0;
        for(int g:hs){
            ans[idx++] = g;
        }
        return ans;
    }
}
