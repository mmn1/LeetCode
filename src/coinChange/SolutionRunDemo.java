package coinChange;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] coins = {3, 5, 6};
		int res = sol.coinChange(coins, 7);
		System.out.println(res);
		
//		int k = 0x7fff_fffe;
//		System.out.println(k);
	}
}
