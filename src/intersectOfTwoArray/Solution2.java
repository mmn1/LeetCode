package intersectOfTwoArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	ArrayList<Integer> arr = new ArrayList<>();
    	int i = 0, j = 0;
    	while(i < nums1.length && j < nums2.length) {
    		if(nums1[i] > nums2[j]) {
    			j++;
    		}else if(nums1[i] < nums2[j]) {
    			i++;
    		}else {
    			arr.add(nums1[i]);
    			i++;
    			j++;
    		}
    	}
    	int[] num = new int[arr.size()];
    	for(int iTemp=0; iTemp<arr.size(); iTemp++)
    		num[iTemp] = arr.get(iTemp);
    	return num;
    }
}
