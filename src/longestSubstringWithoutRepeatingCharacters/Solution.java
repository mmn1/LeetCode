
package longestSubstringWithoutRepeatingCharacters;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
//      longestStr;
		int strLength = 0;
		for(int i=0; i<s.length(); i++) {
         if (strLength == 0)
             strLength++;
			StringBuffer longestStr = new StringBuffer("");
			longestStr.append(s.charAt(i));
			for(int j=i+1; j<s.length(); j++) {
				if(longestStr.toString().indexOf(s.charAt(j)) != -1)
					break;
				else if((longestStr.toString().indexOf(s.charAt(j)) == -1 && strLength <= (j-i))){
					strLength++;
             }
				longestStr.append(s.charAt(j));
			}
		}
		return strLength;
	}
}
