package Leetcode;

public class Arranging_coins {
    public int arrangeCoins(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            n = n-i;
            count++;
        }
        return count;
    }
}
