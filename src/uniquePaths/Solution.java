package uniquePaths;

public class Solution {
	private int res = 0;
    public int uniquePaths(int m, int n) {
        helper(m, n, 1, 1);
        return res;
    }
    public void helper(int m, int n, int curM, int curN) {
    	if(curM == m && curN == n) {
    		res++;
    		return;
    	}
    	if(curN < n) {
    		helper(m, n, curM, curN+1);
    	}
    	if(curM < m) {
    		helper(m, n, curM+1, curN);
    	}
    	return;
    }
}
