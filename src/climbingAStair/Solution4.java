package climbingAStair;

public class Solution4 {
    public int climbStairs(int n) {
    	if(n == 1)	return 1;
    	int res = 0, frist = 1, second = 2;
    	for(int i=3; i<=n; i++) {
    		res = frist + second;
    		frist = second;
    		second = res;
    	}
    	return res;
    }
}
