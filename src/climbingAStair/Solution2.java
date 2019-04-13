package climbingAStair;

public class Solution2 {
    public int climbStairs(int n) {
    	int[] meno = new int[n];
    	return climb(0, n, meno);
    }
    public int climb(int cur, int num, int[] last) {
    	if(cur == num) {
    		return 1;
    	}
    	if(cur > num) {
    		return 0;
    	}
    	if(last[cur] != 0) {
    		return last[cur];
    	}
    	return last[cur] = climb(cur+1, num, last) + climb(cur+2, num, last);
    }
}
