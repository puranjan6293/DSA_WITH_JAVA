package Leetcode;
import java.util.*;
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        backTrack(ans, new ArrayList<Integer>(), 1, n, k);
        return ans;
    }
    static void backTrack(List<List<Integer>> ans, List<Integer> comb,int start,int n,int k){
        //Step1
        if(k==0){
            ans.add(new ArrayList<Integer>(comb));
            return;
        }
        
        //step2
        for(int i=start;i<=n;i++){
            //add i to comb
            comb.add(i);
            
            //call recursion
            backTrack(ans, comb, i+1, n, k-1);
            
            //remove element from comb
            comb.remove(comb.size()-1);
        }
    }
}
