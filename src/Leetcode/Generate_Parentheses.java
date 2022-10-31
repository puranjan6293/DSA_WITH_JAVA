package Leetcode;
import java.util.*;
public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        //Using DFS
        List<String> ans = new ArrayList<>();
        generateOneByOne("", ans, n, n);
        return ans;
        
    }
    void generateOneByOne(String subList, List<String> ans, int left, int right){
        if(left>right){
            return;
        }
        if(left>0){
            generateOneByOne(subList + "(", ans, left-1, right);
        }
        if(right>0){
            generateOneByOne(subList + ")", ans, left, right-1);
        }
        if(left==0 && right==0){
            ans.add(subList);
            return;
        }
    }
}
