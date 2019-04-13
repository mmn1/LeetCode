package rotateArray;
import java.util.Arrays;
public class Solution2 {
	public void rotate(int[] nums, int k) {
		int len = nums.length,kk;
		if(k >= len)
			kk = k % len;
		else
			kk = k;
		int [] arr = Arrays.copyOf(nums, len);
		for(int i=0; i<len; i++) {
			nums[(i+kk)%len] = arr[i];
		}
	}
}
