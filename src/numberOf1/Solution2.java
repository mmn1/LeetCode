package numberOf1;

public class Solution2 {
    public int hammingWeight(long n) {
    	int count = 0;
    	int flag = 1;
    	while(flag != 0) {
    		if((flag & n) != 0) {
    			count++;
    		}
    		flag = flag << 1;
    	}
    	return count;
    }
}
