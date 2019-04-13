package stringToInteger;

public class Solution4 {
    public int myAtoi(String str) {
    	str = str.trim();
    	if(str.length() == 0) {
    		return 0;
    	}
    	int sign = 1, res = 0, temp = 0;
    	if(str.charAt(0) == '-') {
    		sign = -sign;
    		str = str.substring(1);
    	}else if(str.charAt(0) == '+'){
    		str = str.substring(1);
    	}
    	for(int i=0; i<str.length(); i++) {
    		if(!Character.isDigit(str.charAt(i)))
    			break;
    		res = res * 10 + str.charAt(i) - '0';
    		if(res < temp) {
    			if(sign == 1) {
    				return Integer.MAX_VALUE;
    			}else {
    				return Integer.MIN_VALUE;
    			}
    		}
    		temp = res;
    	}
    	if(sign == -1) {
    		return -res;
    	}
    	return res;
    }
}
