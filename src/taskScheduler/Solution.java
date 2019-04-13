package taskScheduler;

import java.util.Arrays;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
    	if(tasks.length == 0)	return 0;
        int[] nums = new int[26];
        int res = 0, tmp = 0;
        for(int i=0; i<tasks.length; i++) {
        	nums[tasks[i] - 'A']++;
        }
        Arrays.sort(nums);
        while(nums[25] != 0) {
        	tmp = 0;
        	for(int j=0; j<=n; j++) {
        		if(j <= 25 && nums[25-j] > 0) {
        			nums[25-j]--;
        			tmp++;
        		}
        		res++;
//        		if(nums[25-j] == 0 && 25-j-1 > 0 && nums[25-j-1] ==0) {
//        			break;
//        		}
        	}
        	Arrays.sort(nums);
        }
        if(n >= tmp)	res = res - n + tmp - 1;
        return res;
    }
}
