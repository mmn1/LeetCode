package coinChange;
//还是动态规划，但是这道题还是不会。。。。。
//有空再看看这道题
//贪心算法 != 动态规划
public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 100;
            for (int j = 0; j < coins.length; j++)
                if (i >= coins[j])  //① && dp[i - coins[j]] != 0x7fffffff
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
