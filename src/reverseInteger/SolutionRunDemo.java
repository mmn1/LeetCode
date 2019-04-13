package reverseInteger;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int x = 0;
		int y = sol.reverse(x);
		System.out.println(y);
		
		
		Solution1 sol1 = new Solution1();
		int y1 = sol1.reverse(x);
		System.out.println(y1);
	}
}
