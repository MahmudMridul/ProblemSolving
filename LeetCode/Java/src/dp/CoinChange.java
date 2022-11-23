package dp;

import java.util.Arrays;

public class CoinChange {
    public int minNumOfCoins(int coins[], int value) {
        if(value == 0) {
            return 0;
        }

        int dp[] = new int[value + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int val = 1; val <= value; ++val) {
            for(int index = 0; index < coins.length; ++index) {
                if(coins[index] <= val) {
                    int currCount = dp[val - coins[index]];

                    if(currCount != Integer.MAX_VALUE && currCount + 1 < dp[val]) {
                        dp[val] = currCount + 1;
                    }
                }
            }
        }

        if(dp[value] == Integer.MAX_VALUE) {
            return -1;
        }

        return dp[value];

    }
}
