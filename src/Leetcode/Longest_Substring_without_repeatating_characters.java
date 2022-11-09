package Leetcode;

public class Longest_Substring_without_repeatating_characters {
    public int lengthOfLongestSubstring(String s) {
        
        //Approach1, using sliding window concept, T.C : O(n), S.C : O(128)
        int n = s.length();
        int longest = 0;
        int[] ans = new int [128];
        
        //Since we're working with two pointers, 
        //we can quite conveniently find the length of 
        //our current window using r - l + 1. 
        //We can update this anytime it's larger than our 
        //current maximum.
        
        for(int left = 0, right = 0; right<n;right++){
            left = Math.max(ans[s.charAt(right)], left);
            longest = Math.max(longest, right-left+1);
            ans[s.charAt(right)] = right+1;
        }
        return longest;
        
        
        /*
        //Approach2, using hashmap
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int len = 0;
        int left = 0, right = 0;
        
        //traverse right pointer in the array
        while(right<n){
            //check if map contains the character
            if(map.containsKey(s.charAt(right))){
                //if contains, just move one step the left pointer
                //if it lies left of left that we dont have to update it
                //so, i am using here math.max
                left = Math.max(map.get(s.charAt(right))+1, left);
                    
            }
            //if map is not contain just put the character in to the map
            map.put(s.charAt(right), right);
            //here is the formula: r-l+1
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
        */
    }
}
