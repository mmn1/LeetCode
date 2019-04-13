package taskScheduler;

public class SolutionRunDemo {
	public static void main(String args[]) {
		Solution sol = new Solution();
		char[] tmp = {'A','A','A','B','B','B'};
		int res = sol.leastInterval(tmp, 0);
		System.out.println(res);
	}
}
