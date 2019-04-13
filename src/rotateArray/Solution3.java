package rotateArray;

public class Solution3 {
	public void rotate(int[] nums, int k) {
		int len = nums.length;
		reverse(nums, 0, len-1);
		reverse(nums, 0, k%len-1);
		reverse(nums, k%len, len-1);
	}
	
	public void reverse(int[] nums, int start, int end) {
		int tep;
		while(start < end) {
			tep = nums[start];
			nums[start] = nums[end];
			nums[end] = tep;
			start++;
			end--;
		}
	}
}
