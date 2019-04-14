package sumOfSubarrayMinimums;

public class Solution {
    public int sumSubarrayMins(int[] A) {
        int res = 0, min = 30000;
        int confirm = 1000000007;
        for(int i=0; i<A.length; i++) {
        	min = 30000;
        	for(int j=0; j+i<A.length; j++) {
        		if(A[i+j] < min) {
        			min = A[i+j];
        		}
        		res += min;
        		if(res >= confirm) {
        			res = res % confirm;
        		}
        	}
        }
        return res;
    }
}
