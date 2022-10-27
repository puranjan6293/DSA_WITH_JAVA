package Leetcode;
import java.util.*;
public class Longest_Palindrome {
    public int longestPalindrome(String s) {
        //Approach1
        if(s==null || s.length()==0) return 0;
        
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
        // If hset contains character already, emove that character & adding 2 to length...
        // It means we get pair of character which is used in palindrome...
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count*2+1;
        return count*2;
        
    }
}
