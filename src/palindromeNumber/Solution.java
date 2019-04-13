package palindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
//		int y = Math.abs(x);
//		String s = String.valueOf(y);
//		int len = s.length();
//		int halfLen = len/2, temp = 0;
//		for(int i=0; i<halfLen; i++) {
//			temp = y % 10;
//			y = y / 10;
//			if(temp!=Integer.valueOf(s.charAt(i)))
//				return false;
//		}
//		return true;
		
		if(x<0)
			return false;
		String s = String.valueOf(x);
		int len = s.length();
		int halfLen = len/2, temp = 0;
		for(int i=0; i<halfLen; i++) {
			temp = x % 10;
			x = x / 10;
			int test = Integer.valueOf(s.substring(i, i+1));
//			System.out.println(test);
			if(temp!=test)
				return false;
		}
		return true;
	}
}
