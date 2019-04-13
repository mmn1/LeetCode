package longestIncreasingSubsequence;

public class Solution {
	public int lengthOfLIS(int[] nums) {
	    int[] tails = new int[nums.length];
	    //利用一个数组来存储一个有序的分组，后面每一个可以替换的更优解，都可以直接在数组对应位置安置。
	    //除非比之前的所有值都大，否则不会增加数组元素的个数
	    
	    //其实核心就是如果不触及最后面那一个，谁放在哪都无所谓
	    int size = 0;
	    for (int x : nums) {	//遍历原数组
	        int i = 0, j = size;
	        while (i != j) {	//通过折半查找，确定新输入元素的位置
	            int m = (i + j) / 2;
	            if (tails[m] < x)
	                i = m + 1;
	            else
	                j = m;
	        }
	        tails[i] = x;	//在合适的位置安放新元素
	        if (i == size) ++size;	//如果元素被安置在数组的最后面则扩大数组
	    }
	    return size;
	}
}
