package palindromeString;

public class Solution {
    public boolean isPalindrome(String s) {
    	String str = "";
    	s = s.toLowerCase();
    	for(int i=0; i<s.length(); i++) {
    		if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
    			str = str.concat(s.substring(i, i+1));
    		if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
    			str = str.concat(s.substring(i, i+1));
    	}
    	//char[] cArr = str.toCharArray();
    	for(int i=0; i<str.length()/2; i++) {
    		if(str.charAt(i) != str.charAt(str.length()-i-1)) {
    			return false;
    		}
    	}
    	return true;
    }
}
