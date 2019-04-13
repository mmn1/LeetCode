package searchForARange;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] tmp = {1, 2, 3, 6, 6, 8};
		System.out.println(Arrays.toString(sol.searchRange(tmp, 6)));
	}
}
