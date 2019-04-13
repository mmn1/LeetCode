package longestIncreasingSubsequence;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {10,9,2,5,3,7,101,18};
		Arrays.sort(arr);
		int lens = arr.length;
		int test = Arrays.binarySearch(arr, 0, lens, 8);	
		//折半查找对应范围内是否存在查找的元素，如果没有找到则返回对应的    负值    位置应该存在
		//1 > -1
		//4 > -3
		//8 > -5
		//即k = - k - 1;如果该元素如果在数组中存在的话，应该存在哪个位置
		int res = sol.lengthOfLIS(arr);
		System.out.println(test);
	}
}
