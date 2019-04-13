package setMatrixZeroes;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[][] kk = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
		sol.setZeroes(kk);
		System.out.println(Arrays.deepToString(kk));
	}
}
