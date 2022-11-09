package Leetcode;

public class Coin_Change {
    public int coinChange(int[] coins, int amount) {
        /*
        //Approach1, 
        if (coins == null || coins.length == 0)
			return -1;

		if (amount <= 0)
			return 0;

		int dp[] = new int[amount + 1];
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Integer.MAX_VALUE;
		}

		for (int am = 1; am < dp.length; am++) {
			for (int i = 0; i < coins.length; i++) {
				if (coins[i] <= am) {
					int sub = dp[am - coins[i]];
					if (sub != Integer.MAX_VALUE)
						dp[am] = Math.min(sub + 1, dp[am]);
				}
			}
		}
		return dp[dp.length - 1] == Integer.MAX_VALUE ? -1 : dp[dp.length - 1];
        */
        
        //Approach2, T.C O(n), S.C O(1)
        int[] dp = new int[amount + 1];
        for (int i=1; i < dp.length; i++) {
          dp[i] = dp.length;
          for (int j=0; j < coins.length; j++) {
            if (i >= coins[j]) dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
          }
        }
        return dp[amount] == dp.length ? -1 : dp[amount];
    }
}
