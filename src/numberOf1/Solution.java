package numberOf1;

public class Solution {
    public int hammingWeight(int n) {
    	char[] ch = Integer.toBinaryString(n).toCharArray();
    	int res = 0;
    	for(int i=0; i<ch.length; i++) {
    		if(ch[i] == '1')
    			res++;
    	}
    	return res;
    }
}
