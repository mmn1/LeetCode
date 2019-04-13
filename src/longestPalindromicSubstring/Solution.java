package longestPalindromicSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	public String longestPalindrome(String s) {
		String str = null;
//		Set<Character> set = new HashSet<>();
		Map<Character, Integer> map = new HashMap<>();
		int i = 0, j = 0, n=s.length(), x=0, len=0;
		while(i<n && j<n) {
			if(!map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), j);
				j++;
			}else {
				int temp = map.get(s.charAt(j));
				if(len<(j-temp)) {
					x = temp;
					len = j-temp;
				}//else if(len<(j-temp) && s.charAt(j)==s.charAt(j+1) && s.charAt(i)!=s.charAt(j)) {
					
				for(int ii=i; ii<temp+1; ii++) {
					map.remove(s.charAt(ii));
				}
				i = temp+1;
			}
		}
		char[] ss = s.toCharArray();
		return str.valueOf(ss, x, len+1);
	}
}
