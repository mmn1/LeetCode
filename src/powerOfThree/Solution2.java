package powerOfThree;

public class Solution2 {
    public boolean isPowerOfThree(int n) {
    	return Integer.toString(n, 3).matches("10*$");
    	//����Ӧ����ת��Ϊ��Ӧ���Ƶ��������ַ�����ʾ��
    	//����������ʽ���бȽ�
    }
}
