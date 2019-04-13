package longestPalindromicSubstring;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "acac";
		String result = sol.longestPalindrome(s);
		System.out.println(result.trim());
		
		Solution1 sol1 = new Solution1();
		String result1 = sol1.longestPalindrome(s);
		System.out.println(result1.trim());
	}
}
