package addDigits;

public class Solution {
    public int addDigits(int num) {
    	//���ֶ������ͨ���ҹ���ʵ�֣�����ȷ��ȡ�඼�Ǵ�1-9�ظ����ֵ�
    	//���´�����ͨ��ֱ��ʵ�ֵ�n(1)
        int carr = 0, res = 0;
        while(carr == 1 || num > 0) {
        	int num1 = num % 10;
        	num = num / 10;
        	res = carr + num1 + res;
        	carr = res / 10;
        	res = res % 10;
        }
        return res;
    }
}
