package randomPickWithBlacklist;

import java.util.Random;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution(4, new int[] {0,1});
		Random ran = new Random();
		System.out.println(sol.pick());
	}
}
