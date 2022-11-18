package Leetcode;

public class Detect_Capital {
    public boolean detectCapitalUse(String word) {
        return word.substring(1).equals(word.substring(1).toLowerCase())||word.equals(word.toUpperCase());
    }
}
