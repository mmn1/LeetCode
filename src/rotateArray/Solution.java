package rotateArray;
//记得测试赋值前后有无影响
public class Solution {
	public void rotate(int[] nums, int k) {
		int len = nums.length,temp,kk;
		if(k >= len)
			kk = k % len;
		else
			kk = k;
	    for(int i=0; i<kk; i++) {
	    	temp = nums[len-1];
	    	for(int j=len-1; j>0; j--) {
	    		nums[j] = nums[j-1];
	    	}
	    	nums[0] = temp;
	    }
    }
}
