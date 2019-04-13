package x132Pattern;

public class Solution {
    public boolean find132pattern(int[] nums) {
    	if(nums.length < 3)	return false;
        int low = nums[0];
        for(int i=1; i<nums.length - 1; i++) {
        	for(int j=0; j<i; j++) {
        		if(nums[j] < low) {
        			low = nums[j];
        		}
        	}
        	for(int k=i+1; k<nums.length; k++) {
        		if(nums[k] > low && nums[k] < nums[i]) {
        			return true;
        		}
        	}
        }
        return false;
    }
}
