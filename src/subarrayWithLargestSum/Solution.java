package subarrayWithLargestSum;

public class Solution {
    public int maxSubArray(int[] nums) {
    	if(nums.length == 0)	return 0;
    	int res = Integer.MIN_VALUE, temp = 0;
    	for(int i=0; i<nums.length; i++) {
    		temp = temp + nums[i];
    		if(temp > res)	res = temp;
    		if(temp < 0)	temp = 0;
    	}
    	return res;
    }
}
