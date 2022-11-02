package Leetcode;
import java.util.*;
public class Word_Break {
    /*
    //Approach1
    public boolean wordBreak(String s, List<String> wordDict) {
        //convert to set
        HashSet<String> dict = new HashSet<>(wordDict);
        //using dp
        
        boolean[] flag = new boolean[s.length()+1];
        flag[0] = true;
        
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(flag[j] && dict.contains(s.substring(j,i))){
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[s.length()];
    }
    */
    //Approach2
    public boolean wordBreak(String s, List<String> wordDict) {
        // for memoization
            HashMap<String,Boolean> map= new HashMap<>();
            return canConstruct(s, wordDict, map);
        }
        
        public boolean canConstruct(String target,List<String> words, HashMap<String,Boolean> map)
        {
        
        // if answer already cached, return it
            if(map.containsKey(target))
                return map.get(target);
                
            // if target string is empty
            // it can always be constructed by taking no elements from dictionary
            if(target.isEmpty())
                return true;
                
            // for all words in the dictionary
            for(String word: words)
            {
            // if the target starts with the given word
                if(target.startsWith(word))
                {
                // and it is possible to construct the rest of the string
                // from the words in the dictionary
                    if(canConstruct(target.substring(word.length()),words, map))
                    {
                    
                    // save and return true
                        map.put(target, true);
                        return true;
                    }
                }
            }
            
            // if it was not possible to construct the target from words from the dictionary
            // save and return false to the previous call
            map.put(target,false);
            return false;
        }
}
