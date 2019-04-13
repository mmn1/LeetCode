package coinChange;
//�÷���ȷʵʮ���������0x7fff_fffe ��� 0x7fff_ffff��
//ͬʱ��Ӳ�� i = coin������ʡȥ��ԭ�ȴ���ٴ����жϣ��Ӷ��ﵽ�Ż�Ч����
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
