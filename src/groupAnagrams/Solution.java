package groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> res = new LinkedList<>();
    	if(strs.length == 0)	return res;
    	Map<String, List> map = new HashMap<>();
    	for(String str : strs) {
    		char[] ch = str.toCharArray();
    		Arrays.sort(ch);
    		String tmp = new String(ch);
    		if(!map.containsKey(tmp)) {
    			map.put(tmp, new ArrayList<>());
    		}
    		map.get(tmp).add(str);
    	}
    	return new ArrayList(map.values());		//ArrayList的另一种命名方式，直接利用map
    }
}
