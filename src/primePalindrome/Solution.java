package primePalindrome;

public class Solution {
    public int primePalindrome(int N) {
    	if(N < 3) {
    		return 2;
    	}
    	int tmp = (N % 2 == 0) ? N + 1 : N;
        while(true) {
        	String s = String.valueOf(tmp);
        	if(s.length() % 2 == 0 && tmp != 11) {
        		tmp = (int) Math.pow(10, s.length()) + 1;
        	}else {
        		if(isPalindrome(s) && isPrime(tmp)) {
        			return tmp;
        		}
        		tmp = tmp + 2;
        	}
        }
    }
    
    public boolean isPalindrome(String s) {
    	char[] c = s.toCharArray();
    	int left = 0, right = s.length()-1;
    	while(left < right) {
    		if(c[left++] != c[right--]) {
    			return false;
    		}
    	}
    	return true;	//是回文
    }
    
    public boolean isPrime(int N) {
    	int sqrt = (int) Math.sqrt(N);
    	for(int i=2; i<=sqrt; i++) {
    		if(N % i == 0) {
    			return false;
    		}
    	}
    	return true;	//是质数
    }
}
