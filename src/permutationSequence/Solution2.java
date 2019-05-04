package permutationSequence;

public class Solution2 {
    public String getPermutation(int n, int k) {
    	if(n == 1)	return "1";
    	int pos = 0;	//��ǰ��ʲôλ��
    	int[] base = new int[n];
    	base[1] = base[0] = 1;
    	for(int i=2; i<n; i++) {
    		//ÿһ��λ�û���������ȥ���λ�ã��������λ�ÿ����е�������ϸ���
    		base[i] = i * base[i-1];	
    	}
    	boolean[] select = new boolean[n];	//�ж��Ƿ��Ѿ���ѡ��
    	char[] res = new char[n];	//�洢�ַ���
    	k -= 1;	//��Ϊ���շ���k�õ������е���k+1������Ҫ��-1
    	while(pos < n) {
    		int kk = k / base[n - pos - 1];
    		k %= base[n - pos - 1];
    		for(int i = 0; i < n; i++) {
    			if(!select[i]) {
    				if(kk == 0) {
    					select[i] = true;
    					res[pos++] = (char)(i+1+48);
    					break;
    				}else {
    					kk--;
    				}
    			}
    		}
    	}
    	return new String(res);
    }
}
