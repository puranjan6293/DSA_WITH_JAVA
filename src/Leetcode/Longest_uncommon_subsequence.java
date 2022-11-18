package Leetcode;

public class Longest_uncommon_subsequence {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
