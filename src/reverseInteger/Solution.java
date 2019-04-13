package reverseInteger;

public class Solution {
	public int reverse(int x) {
		if(x<-2147483648 || x>2147483647)
			return 0;
		int m = 0, n = Math.abs(x);
		String str = new String();
		String str1 = null;
		while(n > 0) {
			str = String.valueOf(m);
			m = m * 10 + n % 10;
			n = n / 10;
			str1 = String.valueOf(m);
		}
		if(str.charAt(0) != str1.charAt(0))
				return 0;
		if(x<0)
			m = 0-m;
		return m;
	}
}
