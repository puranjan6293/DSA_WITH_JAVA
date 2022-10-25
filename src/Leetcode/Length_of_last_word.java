package Leetcode;

public class Length_of_last_word {
    public int lengthOfLastWord(String s) {
        String[] ans = s.split(" ");
        return ans[ans.length-1].length();
    }
}
