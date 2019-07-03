package bestSightseeingPair;

public class Solution {
    public int maxScoreSightseeingPair(int[] A) {
    	int res = 0, localMax = 0;
    	for(int i=0; i<A.length; i++) {
    		res = Math.max(res, localMax + A[i] - 1);
    		localMax = Math.max(localMax - 1, A[i]);
    	}
    	return res;
    }
}
