package romanToInteger;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "XII";
		int x = sol.romanToInt(s);
		System.out.println(x);
		
		Solution sol1 = new Solution();
		int x1 = sol1.romanToInt(s);
		System.out.println(x1);
	}
}
