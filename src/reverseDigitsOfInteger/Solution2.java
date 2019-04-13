package reverseDigitsOfInteger;

public class Solution2 {
    public int reverse(int x) {
    	String str = new String(x+"");
    	char sign = str.charAt(0);
    	int number = 0, temp = 0;
    	if(sign == '+' || sign == '-') {
    		str = str.substring(1);
    	}
    	for(int i=str.length()-1; i>=0; i--) {
    		number = (int)(str.charAt(i)-'0') + number * 10;
    		if(number/10 != temp)
    			return 0;
    		temp = number;
    	}
    	if(sign == '-')
    		number = -number;
    	return number;
    }
}
