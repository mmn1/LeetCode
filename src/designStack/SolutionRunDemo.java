package designStack;

public class SolutionRunDemo {
	public static void main(String[] args) {
		int[] arr = {2,1,1,2};
		MinStack2 sol = new MinStack2();
		sol.push(2);
		sol.push(2);
		sol.push(2);
		sol.push(-4);
		sol.push(3);
		sol.push(66);
		sol.push(1);
		int res = sol.getMin();
		System.out.println(res);
	}
}
