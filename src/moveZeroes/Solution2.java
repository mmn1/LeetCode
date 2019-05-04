package moveZeroes;

public class Solution2 {
    public void moveZeroes(int[] nums) {
        int numsOfZero = 0, len = nums.length;
        if(len == 1)    return;
        for(int i=0; i<len-numsOfZero; ) {
        	if(nums[i + numsOfZero] == 0) {
        		numsOfZero++;
        		continue;
        	}
        	nums[i] = nums[i+numsOfZero];
        	i++;
        }
        for(int i=0; i<numsOfZero; i++) {
        	nums[len - 1 - i] = 0;
        }
    }
}
