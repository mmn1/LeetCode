package hammingDistance;
//Ӧ�ö࿼��һ�¶����Ʊ��������
//�Ƚ��ж����Ƶ�������㣬����������1���ǲ�һ���ģ�����ֱ������1�ĸ���
public class Solution2 {
    public int hammingDistance(int x, int y) {
    	int mix = x ^ y;	//�������������а�λ���,��Ӧλ��ֵ��һ����Ϊ1
    	int flag = 1, res = 0;
    	while(flag != 0) {
    		if((flag & mix) != 0) {
    			res++;
    		}
    		flag = flag << 1;
    	}
    	return res;
    }
}
