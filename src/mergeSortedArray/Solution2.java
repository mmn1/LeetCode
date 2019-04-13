package mergeSortedArray;

//利用双指针的手法，与以前不同的是这里是从后往前进行排序的
public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int i = m - 1, j = n - 1, k = m + n - 1;
    	while(i > -1 && j > -1) {
    		nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
    	}
    	while(j > -1) {	
    		//因为就是在nums1上面排序的，所以如果nums2都排进去的那就已经排序结束了。如果没有排进去，就在这里再排进去
    		nums1[k--] = nums2[j--]; 
    	}
    }
}
