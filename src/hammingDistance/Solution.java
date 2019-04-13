package hammingDistance;

public class Solution {
    public int hammingDistance(int x, int y) {
    	char[] ch1 = Integer.toBinaryString(x).toCharArray();
    	char[] ch2 = Integer.toBinaryString(y).toCharArray();
    	int h = 0, res = 0, len1 = ch1.length, len2 = ch2.length, kk;
    	while(h<len1 && h<len2) {
    		if(ch1[len1-1-h] != ch2[len2-1-h]) {
    			res++;
    		}
    		h++;
    	}
    	for( ; h<len1; h++) {
    		if(ch1[len1-1-h] != '0') {
    			res++;
    		}
    	}
    	for( ; h<len2; h++) {
    		if(ch2[len2-1-h] != '0') {
    			res++;
    		}
    	}
    	return res;
    }
}
