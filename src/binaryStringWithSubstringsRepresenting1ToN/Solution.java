package binaryStringWithSubstringsRepresenting1ToN;

public class Solution {
    public boolean queryString(String S, int N) {
        for(int i=1; i<=N; i++) {
        	String tmp = Integer.toBinaryString(i);
            if(!S.contains(tmp)) {
            	return false;
            }
        }
        return true;
    }
}
