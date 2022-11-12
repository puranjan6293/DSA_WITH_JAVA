package Leetcode;
import java.util.*;
public class Third_maximum_Number {
    public int thirdMax(int[] nums) {
        //using HashSet, T.C : O(nlogn), S.C : O(n)
        HashSet<Integer> hs = new HashSet<>();
        for(int e:nums){
            hs.add(e);
        }
        ArrayList<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        if(list.size()<3) return list.get(list.size()-1);
        return list.get(list.size()-3);
    }
}
