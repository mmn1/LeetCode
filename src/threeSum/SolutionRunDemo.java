package threeSum;

import java.util.List;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] kk = {-4, 0, -1, 1, -1, 2};
		List<List<Integer>> res = sol.threeSum(kk);
		System.out.println(res);
	}
}
