package twoSum;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		int[] arr = {2,7,15,22,555,19};
		int k = 9;
		Solution sol = new Solution();
		System.out.println(Arrays.toString(sol.twoSum(arr, k)));
	}
}
