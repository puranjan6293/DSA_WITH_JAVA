package Leetcode;
import java.util.*;
public class Repeated_SNA_Sequence {
    public List<String> findRepeatedDnaSequences(String s) {
        /*
        //Approach1, using hashset
        /*my idea is to get all the possible 10 letter long sequences and put them into set, it the operation failed, it means there are duplicates. so put the sequence into another set("AAAAAAAAAAAA" could have three "AAAAAAAAAA" sequences, so this set will remove the duplicates) then add all the set to the final list.//
        
        List<String> ans = new ArrayList<>();
        HashSet<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();
        int len = s.length();
        
        //base case
        if(s==null || len<=10){
            return ans;
        }
        for(int i=0;i<=len-10;i++){
            String sub = s.substring(i, i+10);
            if(!s1.add(sub)){
                s2.add(sub);
            }
        }
        ans.addAll(s2);
        return ans;
        */
        //Approach2, using hashMap
        List<String> ans = new ArrayList<>();
        // hashmap to contains all substring of 10 length and frequency map
        HashMap<String, Integer> map = new HashMap<>();
        int len = s.length();
        
        for(int i=0;i+10<=len;i++){
            String sub = s.substring(i, i+10);
            map.put(sub, map.getOrDefault(sub, 0)+1);
        }
        
        //adding substring in ans list
        for(String ss:map.keySet()){
            if(map.get(ss)>1){
                // traverse in map and string with greater freq can be stored
                ans.add(ss);
            }
        }
        return ans;
    }
}
