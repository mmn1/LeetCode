package reversedString;

public class SolutionRunDemo {
	public static void main(String[] args) {
		String str = "abcdefg";
		Solution sol = new Solution();
		String str1 = sol.reverseString(str).toString();
		System.out.println(str1);
	}
}
