package findSingleOneInArray;

import java.util.HashSet;

public class Solution2 {
    public int singleNumber(int[] nums) {
    	HashSet<Integer> set = new HashSet<>();
    	for(int i=0; i<nums.length; i++) {
    		if(set.contains(nums[i])) {
    			set.remove(nums[i]);
    		}else {
    			set.add(nums[i]);
    		}
    	}
    	Object[] temp = set.toArray();
    	return (int) temp[0];
    }
}
