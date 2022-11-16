package Leetcode;

public class Longest_Palindromic_subsequence {
    public int longestPalindromeSubseq(String s) {
        if (s == null || s.isEmpty()) return 0;
        int len = s.length();
        int[][] dp = new int[len + 1][len + 1];
        String t = new StringBuilder(s).reverse().toString();
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}
