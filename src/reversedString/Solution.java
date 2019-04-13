package reversedString;

public class Solution {
    public String reverseString(String s) {
    	char[] cArr = s.toCharArray();
    	char temp;
    	for(int i=0; i<cArr.length/2; i++) {
    		temp = cArr[i];
    		cArr[i] = cArr[cArr.length-1-i];
    		cArr[cArr.length-1-i] = temp;
    	}
    	//String bArr = new String(cArr);
    	return new String(cArr);
    }
}
