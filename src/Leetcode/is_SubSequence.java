package Leetcode;

public class is_SubSequence {
    public boolean isSubsequence(String s, String t) {
        //we can solve using two pointers
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}
