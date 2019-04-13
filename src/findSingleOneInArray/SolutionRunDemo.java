package findSingleOneInArray;

public class SolutionRunDemo {
	public static void main(String[] args) {
		int[] arr = {1,3,1,5,3,7,8,7,8};
		Solution3 sol = new Solution3();
		int i = sol.singleNumber(arr);
		System.out.println(i);
	}
}
