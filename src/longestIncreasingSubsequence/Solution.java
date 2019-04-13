package longestIncreasingSubsequence;

public class Solution {
	public int lengthOfLIS(int[] nums) {
	    int[] tails = new int[nums.length];
	    //����һ���������洢һ������ķ��飬����ÿһ�������滻�ĸ��Ž⣬������ֱ���������Ӧλ�ð��á�
	    //���Ǳ�֮ǰ������ֵ���󣬷��򲻻���������Ԫ�صĸ���
	    
	    //��ʵ���ľ�������������������һ����˭�����Ķ�����ν
	    int size = 0;
	    for (int x : nums) {	//����ԭ����
	        int i = 0, j = size;
	        while (i != j) {	//ͨ���۰���ң�ȷ��������Ԫ�ص�λ��
	            int m = (i + j) / 2;
	            if (tails[m] < x)
	                i = m + 1;
	            else
	                j = m;
	        }
	        tails[i] = x;	//�ں��ʵ�λ�ð�����Ԫ��
	        if (i == size) ++size;	//���Ԫ�ر���������������������������
	    }
	    return size;
	}
}
