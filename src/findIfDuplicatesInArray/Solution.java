package findIfDuplicatesInArray;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
    	Set <Integer> set1 = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
        	if(!set1.contains(nums[i])) {
        		set1.add(nums[i]);
        	}else {
        		return true;
        	}
        }
        return false;
    }
}
