package permutations;

import java.util.ArrayList;
import java.util.List;
//����һ���ݹ��⣬
//�ݹ����Ҫ˼�뻹�ǰ�һЩ�����·Ÿ������ȥ�ǣ���һ��ѭ������
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
    		//list��һ���ӿڲ���ֱ��ʹ�ã���������ǰ�����ArrayList֮��Ķ�Ӧ��ʼ����
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
