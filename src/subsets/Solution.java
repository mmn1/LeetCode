package subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	if(nums == null || nums.length == 0) {
    		return res;
    	}
    	helper(res, new ArrayList<Integer>(), nums, 0);
    	res.add(new ArrayList<>());
    	return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> list, int[] nums, int tmp) {
    	if(list.size() > 0 && (list.get(list.size()-1) == nums[nums.length-1])) {
    		return;
    	}
    	for(; tmp<nums.length;) {
    		if(list.contains(nums[tmp]))	continue;
    		list.add(nums[tmp]);
    		res.add(new ArrayList<Integer>(list));
    		tmp++;
    		helper(res, list, nums, tmp);
    		list.remove(list.size()-1);
    	}
    }
}
