package climbingAStair;

public class Solution {
    public int climbStairs(int n) {
    	return climb(0,n);
    }
    public int climb(int cur, int n) {
    	if(cur > n)	return 0;
    	if(cur == n)	return 1;
    	return climb(cur+1, n) + climb(cur+2, n);
    }
}
