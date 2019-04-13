package romanToInteger;

public class Solution1 {
	public int romanToInt(String s) {
		int sum = 0;
		for(int i=s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			switch(c) {
			case 'I':
				sum = sum + 1 * (sum>=5? -1: 1);
				break;
			case 'V':
				sum = sum + 5;
				break;
			case 'X':
				sum = sum + 1 * (sum >= 50? -1: 1);
				break;
			case 'L':
				sum = sum + 50;
				break;
			case 'C':
				sum = sum +1 * (sum >= 500? -1: 1);
				break;
			case 'D':
				sum = sum + 500;
				break;
			case 'M':
				sum = sum + 1000;
				break;
			default:
				break;
			}
		}
		return sum;
	}
}
