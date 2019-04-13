package missingFromArray;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {9,6,4,2,3,5,7,0,1};
		int res = sol.missingNumber(arr);
		System.out.println(res);
	}
}
