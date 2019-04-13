package x132Pattern;

import java.util.Stack;

public class Solution2 {
    public boolean find132pattern(int[] nums) {
    	Stack<Integer> st = new Stack<>();
    	int third = Integer.MIN_VALUE;
    	for(int i=nums.length; i>=0; i--) {
    		if(nums[i] < third)	return true;
    		while(!st.isEmpty() && nums[i] > st.peek()) {
    			if(third < st.peek()) {
    				third = st.peek();
    			}
    			st.pop();
    		}
    		st.push(nums[i]);
    	}
    	return false;
    }
}
