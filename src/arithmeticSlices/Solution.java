package arithmeticSlices;

public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int len = A.length;
        if(len < 3) 	return 0;
        int res = 0, tmp = 2;
        for(int i=1; i<len-1; i++) {
        	if(A[i] - A[i-1] == A[i+1] - A[i]) {
        		tmp ++;
        	}else {
        		res += getNumber(tmp);
        		tmp = 2;
        	}
        }
        if(A[len-1] - A[len-2] == A[len-2] - A[len-3]) {
        	res += getNumber(tmp);
        }
        return res;
    }
    
    public int getNumber(int n) {
    	int res = 0;
    	for(int i=1; i<n-1; i++) {		//�������С��3ֱ�ӷ���0
    		res += i;
    	}
    	return res;
    }
}
