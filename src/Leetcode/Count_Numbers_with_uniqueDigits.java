package Leetcode;

public class Count_Numbers_with_uniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        //Approach, using simple mathematics, T.C : O(1)
        if(n==0) return 1;
        int ans = 10, base = 9;
        for (int i = 2; i <= n && i <= 10; i++) {
            base = base * (9 - i + 2);
            ans += base;
        }
        return ans; 
    }
}
