package Leetcode;
import java.util.*;
public class Assign_cookies {
    public int findContentChildren(int[] childreen, int[] cookies) {
        //Approach, using greedy algorithm, T.C : O(nlogn)
        Arrays.sort(childreen);
        Arrays.sort(cookies);
        
        int child = 0;
        for(int cookie = 0; child<childreen.length && cookie<cookies.length; cookie++){
            if(cookies[cookie]>=childreen[child]){
                child++;
            }
        }
        return child;
    }
}
