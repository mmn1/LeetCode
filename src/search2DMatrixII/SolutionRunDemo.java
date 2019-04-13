package search2DMatrixII;


public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},
				{10,13,14,17,24},{18,21,23,26,30}};
		boolean res = sol.searchMatrix(arr, 26);
		System.out.println(res);
	}
}
