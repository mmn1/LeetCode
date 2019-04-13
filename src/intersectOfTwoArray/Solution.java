package intersectOfTwoArray;

import java.util.HashMap;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int[] a = {};
    	int number = 0;
    	if(nums1.length == 0)
            return nums1;
    	else if(nums2.length == 0)
    		return nums2;
    	for(int i=0; i<nums1.length; i++) {
    		if(map.containsKey(nums1[i])) {
    			int temp = map.get(nums1[i]);
    			temp++;
    			map.replace(nums1[i], temp);
    		}else {
    			map.put(nums1[i], 1);
    		}
    	}
    	for(int i=0; i<nums2.length; i++) {
    		if(map.containsKey(nums2[i])) {
    			if(map.get(nums2[i]) > 0) {
    				int temp = map.get(nums2[i]);
        			temp--;
        			map.replace(nums2[i], temp);
        			if(number == 0) {
        				int[] b=new int[1];//新数组
            			b[0] = nums2[i];
            			a = b;
            			number++;
        			}else {
        				int[] b=new int[a.length+1];//新数组
            			System.arraycopy(a, 0, b, 0, a.length);
            			b[a.length] = nums2[i];
            			a = b;
        			}
    			}
    		}
    	}
    	return a;
    }
}
