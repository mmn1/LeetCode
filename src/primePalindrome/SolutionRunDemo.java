package primePalindrome;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		long startTime = System.currentTimeMillis();	//获取开始时间
		System.out.println(sol.primePalindrome(9989900));
		long endTime = System.currentTimeMillis();//获取结束时间
		System.out.println(endTime - startTime);
//		100030001
//		9989900
	}
}
