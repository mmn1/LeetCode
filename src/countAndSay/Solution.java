package countAndSay;

public class Solution {
    public String countAndSay(int n) {
    	int temp = 1;
    	StringBuffer strB = new StringBuffer();
    	if(n == 1) {
    		return "1";
    	}else {
    		String str = countAndSay(n-1);
    		for(int i=0; i<str.length()-1; i++) {
    			if(str.charAt(i)==str.charAt(i+1)) {
    				temp++;
    				continue;
    			}
    			strB.append(temp);
    			strB.append(str.charAt(i));
    			temp = 1;
    		}
			strB.append(temp);
			strB.append(str.charAt(str.length()-1));
    		return strB.toString();
    	}
    }
}
