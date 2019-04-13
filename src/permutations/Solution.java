package permutations;

import java.util.ArrayList;
import java.util.List;
//又是一道递归题，
//递归的主要思想还是把一些东西下放给计算机去记，简化一个循环过程
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	helper(res, new ArrayList<Integer>(), nums);
    	return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> list, 
    		int[] nums) {
    	if(list.size() == nums.length) {
    		res.add(new ArrayList<>(list));	
    		//list是一个接口不能直接使用，可以在其前面添加ArrayList之类的对应初始化类
    		return;
    	}
    	for(int i=0; i<nums.length; i++) {
    		if(list.contains(nums[i])) {
    			continue;
    		}
    		list.add(nums[i]);
    		helper(res, list, nums);
    		list.remove(list.size()-1);
    	}
    }
}
