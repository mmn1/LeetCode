package primeNumbers;
//一个质数乘以任何数，得到的结果都不是质数
public class Solution2 {
    public int countPrimes(int n) {
    	boolean[] isPrimes = new boolean[n];
    	int count = 0;
    	for(int i=2; i<n; i++) {
    		//从2开始向n普及。
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
