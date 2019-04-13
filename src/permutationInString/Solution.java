package permutationInString;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        int s1_lens = s1.length();
        if(s1.length() > s2.length()) {
        	return false;
        }else if(s1.length() == 0) {
        	return true;
        }
        for(int i=0; i<s1_lens; i++) {
        	char temp = s1.charAt(i);
        	map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        for(int j=0; j<s1_lens; j++) {
        	map.put(s2.charAt(j), map.getOrDefault(s2.charAt(j), 0) - 1);
        	if(map.get(s2.charAt(j)) == 0) {
        		map.remove(s2.charAt(j));
        	}
    	}
        if(map.size() == 0)	return true;
        for(int i=s1_lens; i<s2.length(); i++) {
        	map.put(s2.charAt(i-s1_lens), map.getOrDefault(s2.charAt(i-s1_lens), 0) + 1);
        	if(map.get(s2.charAt(i-s1_lens)) == 0) {
        		map.remove(s2.charAt(i-s1_lens));
        	}
        	map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
            	if(map.get(s2.charAt(i)) == 0) {
            		map.remove(s2.charAt(i));
            	}
        	if(map.size() == 0)	return true;
        }
        return false;
    }
}
