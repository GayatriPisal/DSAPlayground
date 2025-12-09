package leetcode.DP;

import java.util.Arrays;

public class CoinChange {

    public static void main(String args[])
    {
        int amount = 11;

        int[] coins = {1, 2, 5};

        System.out.println(coinChange(amount, coins));
    }

    public static int coinChange(int amount, int[] coins) {

        //TC - O(amount * coins.length)
        //SC - O(amount)
        int dp[] = new int[amount + 1];

        Arrays.fill(dp, (amount+1));
        dp[0] =0;

        for(int a=1; a<=amount; a++)
        {
            for(int coin : coins)
            {
                if(a-coin >=0)
                {
                    dp[a] = Math.min(dp[a], 1+ dp[a-coin]);
                }
            }
        }

        if(dp[amount] == amount+1)
            return -1;
        else
            return dp[amount];

    }
}
