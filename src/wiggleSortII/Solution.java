package wiggleSortII;

import java.util.Arrays;

public class Solution {
    public void wiggleSort(int[] nums) {
    	if(nums.length <= 1) {
    		return;
    	}
        Arrays.sort(nums);
        int len = nums.length;
        int small = (nums.length % 2 == 0) ? nums.length / 2 -1 : nums.length / 2;
        int half = small;
        int big = len-1;
        int[] res = new int[len];
        int i = 0;
        while(small >= 0 && big > half) {
        	res[i++] = nums[small--];
        	res[i++] = nums[big--];
        }
        if(small == 0) {
        	res[i] = nums[small];
        }
        for(i=0; i<len; i++) {
        	nums[i] = res[i];
        }
    }
}
