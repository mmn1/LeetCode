package primeNumbers;
//һ�����������κ������õ��Ľ������������
public class Solution2 {
    public int countPrimes(int n) {
    	boolean[] isPrimes = new boolean[n];
    	int count = 0;
    	for(int i=2; i<n; i++) {
    		//��2��ʼ��n�ռ���
    		if(isPrimes[i] == false) {
    			count++;
    			for(int j=2; j*i<n; j++) {
    				isPrimes[j*i] = true;
    			}
    		}
    	}
    	return count;
    }
}
