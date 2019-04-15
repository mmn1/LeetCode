package buddyStrings;

public class Solution {
    public boolean buddyStrings(String A, String B) {
        int[] arrs_a = new int[26];
        if(A.length() != B.length()) {
        	return false;
        }
        int[] diff = new int[2];
        int time = 0;
        char[] as = A.toCharArray();
        char[] bs = B.toCharArray();
        
        for(int i=0; i<A.length(); i++) {
        	if(as[i] != bs[i]) {
        		if(time >= 2) {
        			return false;
        		}
        		diff[time++] = i;
        	}
        }
        for(int i=0; i<A.length(); i++) {
        	arrs_a[as[i]-'a']++;
        }
        if(time == 2) {
        	if(as[diff[0]] == bs[diff[1]] && as[diff[1]] == bs[diff[0]]) {
        		return true;
        	}
        }else if(time == 0) {
        	for(int i=0; i<26; i++) {
            	if(arrs_a[i] > 1) {
            		return true;
            	}
            }
        }
        return false;
    }
}
