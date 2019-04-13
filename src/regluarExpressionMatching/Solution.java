package regluarExpressionMatching;

public class Solution {
	public boolean isMatch(String s, String p) {
//		int sLen = s.length(), pLen = p.length();
//		for(int i=0; i<sLen; i++) {
//			if(p.charAt(i)=='*')
//				return true;
//			if(p.charAt(i)=='.')
//				continue;
//			if(s.charAt(i) != p.charAt(i)) {
//				if(i+1<pLen) {
//					if(p.charAt(i+1)=='*')
//						continue;
//				}
//				return false;
//			}
//		}
//		return true;
        return s.matches(p);
	}
}
