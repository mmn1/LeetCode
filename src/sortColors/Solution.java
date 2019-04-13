package sortColors;

import java.util.Arrays;

public class Solution {
    public void sortColors(int[] nums) {
    	int[] colors = new int[4];
        for(int i=0; i<nums.length; i++) {
        	switch(nums[i]) {
        	case 0:
        		colors[1]++;
        		colors[2]++;
        		colors[3]++;
        		break;
        	case 1:
        		colors[2]++;
        		colors[3]++;
        		break;
        	case 2:
        		colors[3]++;
        		break;
        	default:
        		break;
        	}
        }
        for(int i=0; i<3; i++) {
        	Arrays.fill(nums, colors[i], colors[i+1], i);
        }
    }
}
