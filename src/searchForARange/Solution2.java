package searchForARange;

public class Solution2 {
    public int[] searchRange(int[] nums, int target) {
    	int start = helper(nums, target, false);
    	int end = helper(nums, target, true);
    	return new int[] {start, end};
    }
    public int helper(int[] nums, int target, boolean islast) {
    	int low = 0, high = nums.length-1, index = -1;
    	while (low <= high) {
    		int mid = low + ((high - low) >> 1);
    		if(islast) {
    			if(nums[mid] <= target) {
    				low = mid + 1;	//这边的更新可能导致nums[low]不等于target，所以下面有if判断
    			}else {
    				high = mid - 1;
    			}
    		}else {
    			if(nums[mid] < target) {
    				low = mid + 1;
    			}else {
    				high = mid - 1;
    			}
    		}
    		if(nums[mid] == target) index = mid; /** update index */
    	}
    	return index;
    }
}
