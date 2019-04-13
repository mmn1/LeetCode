package threeSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> res = new LinkedList<>();	//初始化二维list
    	Arrays.sort(nums);
    	int low, high, sum;
    	for(int i=0; i<nums.length-2; i++) {
    		if(i>0 && nums[i] == nums[i-1]) {
    			continue;	//防止出现重复数组
    		}
    		low = i + 1;
    		high = nums.length - 1;
    		sum = 0 - nums[i];
    		while(low < high) {
    			if(nums[low] + nums[high] == sum) {
    				res.add(Arrays.asList(nums[i], nums[low], nums[high]));
    				//可以利用Arrays类里面的asList直接初始化一个List，并加入到链表中去
    				while(low < high && nums[low] == nums[low+1]) {
    					low++;		//因为已经排序完了，所以这样
    				}
    				while(low<high && nums[high] == nums[high-1]) {
    					high--;
    				}
    				low++;	//有两个数相同第三个数肯定也相同，所以可以直接跳过两个
    				high--;
        		}else if(nums[low] + nums[high] < sum) {
        			low++;
        		}else {
        			high--;
        		}
    		}
    	}
    	return res;
    }
}
