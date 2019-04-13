package zigZagConversion;

public class Solution {
    public String convert(String s, int numRows) {
    	int len = s.length(), temp = 0;
    	StringBuffer[] strB = new StringBuffer[numRows];
    	char[] ss = s.toCharArray();
    	for(int i=0; i<numRows; i++)
    		strB[i] = new StringBuffer();
    	
    	while(temp<len) {
    		for(int i=0; i<numRows && temp<len; i++,temp++)
    			strB[i].append(ss[temp]);
    		for(int i=0; i<numRows-2 && temp<len; i++,temp++)
    			strB[numRows-i-2].append(ss[temp]);
    	}
    	for(int i=1; i<numRows; i++)
    		strB[0].append(strB[i]);
    	return strB[0].toString();
	}
}
