package medianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {
	public double merge(int nums1[],int nums2[]) {		//,int array[]
        //建立c数组，并将nums1添加进去    
        int c[]= Arrays.copyOf(nums1, nums1.length+nums2.length);
        double middle, x1, x2; 
        System.arraycopy(nums2, 0, c, nums1.length, nums2.length);  
        //对c数组进行排序  
        Arrays.sort(c);
        if((c.length%2)==0){
            x1=c[c.length/2];
            x2=c[c.length/2-1];
        	middle = (x1+x2)/2;
        }else
        	middle = c[c.length/2];
        return middle;
	}
}
