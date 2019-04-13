package stringToInteger;

public class Solution2 {
	public int myAtoi(String str) {
        if(str == null || str.length() == 0) return 0;
        int result = 0, sign = 1, i = 0;
        while(i < str.length() && str.charAt(i) == ' ') ++i;
        if(str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = str.charAt(i) == '-' ? -1 : 1;
            ++i;
        }
        while(i < str.length() && isValid(str.charAt(i))) {
            if(result > Integer.MAX_VALUE / 10 || 
            		result == Integer.MAX_VALUE / 10 && 
            		str.charAt(i) - '0' > Integer.MAX_VALUE % 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + str.charAt(i) - '0';
            i++;
        }
        return result * sign;
    }
    
    public boolean isValid(char c) {
        return c - '0' <= 9 && c - '0' >= 0;
    }
}
