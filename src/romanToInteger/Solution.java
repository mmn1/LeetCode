package romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int romanToInt(String s) {
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "I");
//		map.put(10, "X");
//		map.put(100, "C");
//		map.put(1000, "M");
//		map.put(5, "V");
//		map.put(50, "L");
//		map.put(500, "D");
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('X', 10);
		map.put('C', 100);
		map.put('M', 1000);
		map.put('V', 5);
		map.put('L', 50);
		map.put('D', 500);
		int len = s.length(), ans = 0;
		for(int i=0; i<len-1; i++) {
			int l = map.get(s.charAt(i)), r = map.get(s.charAt(i+1));
			if(l < r)
				ans = l * -1 + ans;
			else
				ans = l + ans;
		}
		ans = map.get(s.charAt(len-1)) + ans;
		
		return ans;
	}
}
