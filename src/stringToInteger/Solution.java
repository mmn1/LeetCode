package stringToInteger;

public class Solution {
	public int getAtoi(String s1) {
		StringBuffer sb = new StringBuffer();
		String s = s1.trim();
		int len = s.length(), temp=0;
		int i=0;
		if(s==null || len==0)
			return 0;
		if(s.charAt(0)==43 || s.charAt(0)==45) {
			sb.append(s.charAt(0));
			sb.append('0');
			temp = 1;
			i++;
		}
		for(; i<len; i++) {
			if(48<=s.charAt(i) && s.charAt(i)<=57) {
				temp = 1;
				sb.append(s.charAt(i));
			}else
                break;
		}
		if(temp == 1) {
			String xx = sb.toString();
			try {
				return Integer.valueOf(xx);
			}catch(NumberFormatException e) {
				if(xx.charAt(0)=='-')
					return Integer.MIN_VALUE;
				else 
					return Integer.MAX_VALUE;
			}
		}else
			return 0;
	}
}
