package twoNum;

import java.util.Map;
import java.util.HashMap;

public class Solution3 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement))
				return new int[] {i, map.get(complement)};
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solument");
	}
}