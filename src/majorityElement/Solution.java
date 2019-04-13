package majorityElement;

public class Solution {
	public int majorityElement(int[] nums) {
		int fast = 0, slow = 0, len = nums.length;
		while(fast < len) {
			while(fast < len && nums[fast] == nums[slow]) {
				fast++;
			}
			if(fast >= len)	break;
			int tmp = nums[slow+1];
			nums[slow+1] = nums[fast];
			nums[fast] = tmp;
			slow += 2;
			fast++;
		}
		return nums[slow];
	}
}
