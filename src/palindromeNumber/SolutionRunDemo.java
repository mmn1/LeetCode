package palindromeNumber;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int x = -11;
		boolean ss = sol.isPalindrome(x);
		System.out.println(ss);
		
		Solution1 sol1 = new Solution1();
		boolean ss1 = sol.isPalindrome(x);
		System.out.println(ss1);
	}
}
