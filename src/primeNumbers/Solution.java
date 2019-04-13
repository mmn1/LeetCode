package primeNumbers;

public class Solution {
    public int countPrimes(int n) {
    	int res = 0;
    	for(int i=2; i<n; i++) {
    		if(!notPrimes(i))	res++;
    	}
    	return res;
    }
    public boolean notPrimes(int n) {
    	int len = n / 2;
    	for(int i=2; i<=len; i++) {
    		if(n % i == 0)	return true;
    	}
    	return false;
    }
}