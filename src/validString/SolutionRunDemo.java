package validString;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String test = "{[]}";
		boolean res = sol.isValid(test);
		System.out.println(res);
	}
}
