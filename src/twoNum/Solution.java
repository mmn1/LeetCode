package twoNum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    final static int RESULT_SIZE = 2;
    final static int RESULT_INDEX1 = 0;
    final static int RESULT_INDEX2 = 1;
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        final int[] result = new int[RESULT_SIZE];
        final Map<Integer, Integer> recordMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (recordMap.containsKey(target - nums[i])) {
                result[RESULT_INDEX1] = recordMap.get(target - nums[i]);
                result[RESULT_INDEX2] = i;
                return result;
            } else {
                recordMap.put(nums[i], i);
            }
        }
        return result;
    }
}