package findIfDuplicatesInArray;

public class SolutionRunDemo {
	public static void main(String[] args) {
		int [] arr = {1,2,3,1};
		Solution3 sol = new Solution3();
		boolean bo = sol.containsDuplicate(arr);
		System.out.println(bo);
	}
}
