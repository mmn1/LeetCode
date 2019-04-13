package longestCommonPrefix;

public class Solution2 {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) {
			return "";
		}
		String str = strs[0];
		for(int i=1; i<strs.length; i++) {
			str = compareStr(str, strs[i]);
			if(str == "") {
				break;
			}
		}
		return str;
	}
	public String compareStr(String str1, String str2) {
		int len1 = str1.length(), len2 = str2.length();
		StringBuffer strB = new StringBuffer();
		for(int i=0; i<len1 && i<len2; i++) {
			if(str1.charAt(i) != str2.charAt(i))
				break;
			strB = strB.append(str1.charAt(i));
		}
		return strB.toString();
	}
}
