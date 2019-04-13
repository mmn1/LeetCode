package longestIncreasingSubsequence;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {10,9,2,5,3,7,101,18};
		Arrays.sort(arr);
		int lens = arr.length;
		int test = Arrays.binarySearch(arr, 0, lens, 8);	
		//�۰���Ҷ�Ӧ��Χ���Ƿ���ڲ��ҵ�Ԫ�أ����û���ҵ��򷵻ض�Ӧ��    ��ֵ    λ��Ӧ�ô���
		//1 > -1
		//4 > -3
		//8 > -5
		//��k = - k - 1;�����Ԫ������������д��ڵĻ���Ӧ�ô����ĸ�λ��
		int res = sol.lengthOfLIS(arr);
		System.out.println(test);
	}
}
