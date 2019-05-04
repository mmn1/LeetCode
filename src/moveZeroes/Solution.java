package moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int numsOfZero = 0, len = nums.length;
        for(int i=0; i<len-numsOfZero; ) {
        	if(nums[i] == 0) {
        		numsOfZero++;
        		for(int j=i; j<len-numsOfZero; j++) {
        			nums[j] = nums[j+1];
        		}
        		nums[len-numsOfZero] = 0;
        		continue;
        	}
        	i++;
        }
    }
}
