package anagramString;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
    	int[] arr1 = new int[26], arr2 = new int[26];
    	for(int i=0; i<s.length(); i++) {
    		arr1[s.charAt(i)-97]++;
    	}
    	for(int i=0; i<t.length(); i++) {
    		arr1[t.charAt(i)-97]--;
    	}
    	return Arrays.equals(arr1, arr2);
    }
}
