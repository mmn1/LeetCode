package coinChange;
//该方案确实十分巧妙，利用0x7fff_fffe 替代 0x7fff_ffff，
//同时令硬币 i = coin，这样省去了原先代码①处的判断，从而达到优化效果。
public class Solution2 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) dp[i] = 0x7fff_fffe;
        for (int coin : coins)
            for (int i = coin; i <= amount; i++)
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        return dp[amount] == 0x7fff_fffe ? -1 : dp[amount];
    }
}
