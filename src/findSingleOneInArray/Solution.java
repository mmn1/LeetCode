package findSingleOneInArray;

import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
    	Arrays.sort(nums);
    	for(int i=0; i<(nums.length)/2; i++) {
    		if(nums[2*i] != nums[2*i+1])
    			return nums[2*i];
    	}
    	return nums[nums.length-1];
    }
}
