package deleteDuplicationNumberInArray;

public class Solution {
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0)
			return 0;
		int test = nums[0], number = 1, remainNum = nums.length;
		for(int i=1; i<remainNum; ) {
			if(nums[i] > test) {
				number++;
				test = nums[i];
				i++;
			}else {
				int jj = nums[i];
				for(int j=i; j<nums.length-1; j++) {
					nums[j] = nums[j+1];
				}
				nums[nums.length-1] = jj;
				remainNum--;
			}
		}
		return number;
	}
}
