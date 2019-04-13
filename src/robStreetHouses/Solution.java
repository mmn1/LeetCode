package robStreetHouses;

public class Solution {
    public int rob(int[] nums) {
    	if(nums.length == 0)	return 0;
    	if(nums.length == 1)	return nums[0];
    	return robber(-2, nums);
    }
    public int robber(int cur, int[] nums) {
    	if(cur > nums.length-1)	return 0;
    	if(cur == nums.length-1) return nums[nums.length-1];
    	if(cur == nums.length-2) return nums[nums.length-2];
    	if(robber(cur+2, nums) >= robber(cur+3, nums)) {
    		if(cur<0)
    			return robber(cur+2, nums);
    		else
    			return nums[cur] + robber(cur+2, nums);
    	}else{
    		if(cur<0)
    			return robber(cur+3, nums);
    		else
    			return nums[cur] + robber(cur+3, nums);
    	}
    }
}
