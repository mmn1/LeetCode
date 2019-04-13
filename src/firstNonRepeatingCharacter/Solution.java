package firstNonRepeatingCharacter;

import java.util.Arrays;

public class Solution {
    public int firstUniqChar(String s) {
    	int[] arr = new int [26];
    	Arrays.fill(arr, 0);
    	for(int i=0; i<s.length(); i++) {
    		int temp = (int)s.charAt(i) - 'a';
    		arr[temp]++;
    	}
    	for(int i=0; i<s.length(); i++) {
    		if(arr[s.charAt(i)-97] == 1)
    			return i;
    	}
    	return -1;
    }
}
