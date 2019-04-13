package kthLargestElementInArray;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] tmp = {3,2,3,1,2,4,5,5,6};
		System.out.println(sol.findKthLargest(tmp, 4));
	}
}
