package increasingTripletSubsequence;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
    	for(int i=1; i<nums.length-1; i++) {
    		int low = i - 1, high = i + 1;
    		while(low >= 0 && high <= nums.length-1) {
    			if(nums[low] > nums[i]) {
    				low--;
    				continue;
    			}
    			if(nums[high] < nums[i]) {
    				high++;
    				continue;
    			}
    			if(nums[low] < nums[i] && nums[high] > nums[i]) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
}
