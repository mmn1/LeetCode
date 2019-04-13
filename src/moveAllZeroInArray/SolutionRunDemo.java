package moveAllZeroInArray;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		int[] arr = {0,2,3,0,0,5};
		Solution sol = new Solution();
		sol.moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}
}
