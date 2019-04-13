package mergeSortedArray;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	List<Integer> list = new LinkedList<>();
    	int i = 0, j = 0;
    	while(i < m && j <n) {
    		if(nums1[i] < nums2[j]) {
    			list.add(nums1[i++]);
    		}else {
    			list.add(nums2[j++]);
    		}
    	}
    	if(i != m) {
    		for( ; i < m; i++) {
    			list.add(nums1[i]);
    		}
    	}
    	if(j != n) {
    		for( ; j < n; j++) {
    			list.add(nums2[j]);
    		}
    	}
    	for(int temp=0; temp < m+n; temp++) {
    		nums1[temp] = list.get(temp);
    	}
    }
}
