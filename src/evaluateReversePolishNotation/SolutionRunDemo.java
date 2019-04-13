package evaluateReversePolishNotation;

public class SolutionRunDemo {
	public static void main(String [] args) {
		Solution sol = new Solution();
		String[] strs = {"2","1","+","3","*"};
		int res = sol.evalRPN(strs);
		System.out.println(res);
	}
}
