package topKFrequentElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
        	if(map.containsKey(nums[i])) {
        		int tmp = map.get(nums[i]);
        		map.replace(nums[i], ++tmp);
        	}else {
        		map.put(nums[i], 1);
        	}
        }
        int[] numbers = new int[map.size()];
        int i=0;
        for(int value : map.values()) {
        	numbers[i++] = value;
        }
        Arrays.sort(numbers);
        int lim = numbers[numbers.length - k];
        for(int key : map.keySet()) {
        	if(map.get(key) >= lim) {
        		list.add(key);
        	}
        }
        return list;
    }
}
