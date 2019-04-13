package regluarExpressionMatching;

public class SolutionRunDemo {
	public static void main(String[] args) {
		System.out.println("ab".matches("a*b"));
		
		Solution sol1 = new Solution();
		String s = "ab";
		String p = ".*c";
		System.out.println(sol1.isMatch(s, p));
	}
}
