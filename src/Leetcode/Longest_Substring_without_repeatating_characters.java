package Leetcode;

public class Longest_Substring_without_repeatating_characters {
    public int lengthOfLongestSubstring(String s) {
        //Approach, using sliding window concept, T.C : O(n), S.C : O(128)
        int n = s.length();
        int longest = 0;
        int[] ans = new int [128];
        
        /*Since we're working with two pointers, 
        we can quite conveniently find the length of 
        our current window using r - l + 1. 
        We can update this anytime it's larger than our 
        current maximum.*/
        for(int left = 0, right = 0; right<n;right++){
            left = Math.max(ans[s.charAt(right)], left);
            longest = Math.max(longest, right-left+1);
            ans[s.charAt(right)] = right+1;
        }
        return longest;
    }
}
