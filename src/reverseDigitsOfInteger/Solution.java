package reverseDigitsOfInteger;

public class Solution {
    public int reverse(int x) {
    	int y = 0, temp = 0, yy = 0;
    	
    	while(x != 0) {
    		temp = x % 10;
    		x = x / 10;
    		y = y * 10 + temp;
    		if(y/10 != yy)
    			return 0;
    		yy = y;
    	}
    	return y;	
    }
}
