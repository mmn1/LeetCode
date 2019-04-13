package longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
	public int lengthOfLongestSubstring(String s) {
		int i=0, j=0, ans=0, n=s.length();
		Map<Character, Integer> map = new HashMap<>();
		while(i<n && j<n) {
			if(!map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j++), j);
				ans = Math.max(ans, j-i);
			}else {
				int im = map.get(s.charAt(j));
				for(int ii=i; ii<im; ii++)
					map.remove(s.charAt(ii));
				i = im;
			}
		}
		return ans;
	}
}
