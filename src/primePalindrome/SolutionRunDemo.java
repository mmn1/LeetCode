package primePalindrome;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		long startTime = System.currentTimeMillis();	//��ȡ��ʼʱ��
		System.out.println(sol.primePalindrome(9989900));
		long endTime = System.currentTimeMillis();//��ȡ����ʱ��
		System.out.println(endTime - startTime);
//		100030001
//		9989900
	}
}
