package largestNumber;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	private class LargerNumberComparator implements Comparator<String> {
		@Override
		public int compare(String a, String b) {
			String order1 = a + b;
			String order2 = b + a;
			return order2.compareTo(order1);
		}
	}
    public String largestNumber(int[] nums) {
        String[] tmp = new String[nums.length];
        for(int i=0; i<nums.length; i++) {
        	tmp[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(tmp, new LargerNumberComparator());
        if(tmp[0].equals("0")) {
        	return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String str : tmp) {
        	sb.append(str);
        }
        return sb.toString();
    }
}
