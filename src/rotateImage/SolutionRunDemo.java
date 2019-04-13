package rotateImage;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		Solution sol = new Solution();
		sol.rotate(arr);
		System.out.print(Arrays.toString(arr[0]));
		System.out.print(Arrays.toString(arr[1]));
		System.out.print(Arrays.toString(arr[2]));
	}
}
