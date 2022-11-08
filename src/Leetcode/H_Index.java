package Leetcode;

import java.util.Arrays;

public class H_Index {
    public int hIndex(int[] citations) {
        
        //Approach1, T.C : O(nlogn)
        Arrays.sort(citations);
        int n = citations.length;
        int index = 0;
        
        while(index<n && citations[index]<n-index){
            index++;
        }
        return n-index;
        
        
        /*
        //Approach2, using counting sort, T.C : O(n+k)
        int n = citations.length;
        int[] buckets = new int[n+1];
        for(int c : citations) {
            if(c >= n) {
                buckets[n]++;
            } else {
                buckets[c]++;
            }
        }
        int count = 0;
        for(int i = n; i >= 0; i--) {
            count += buckets[i];
            if(count >= i) {
               return i;
            }
        }
        return 0;
        */
    }
}
