package plusOneToIntegerArray;

public class Solution {
    public int[] plusOne(int[] digits) {
    	int index = digits.length-1, temp = 0;
    	if(digits[index] == 9) {
    		temp = 1;
    	}else {
    		digits[index]++;
    		return digits;
    	}
    	while(index >= 0) {
    		
    		digits[index] = digits[index] + temp;
    		if(digits[index] > 9) {
    			digits[index] = 0;
    			temp = 1;
    			index--;
    		}else {
    			temp = 0;
    			break;
    		}
    	}
    	if(temp == 1) {
    		int[] b = new int[digits.length + 1];
    		b[0] = 1;
    		return b;
    	}
    	return digits;
    }
}
