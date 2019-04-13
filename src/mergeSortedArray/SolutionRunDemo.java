package mergeSortedArray;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
		Solution sol = new Solution();
		sol.merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
	}
}
