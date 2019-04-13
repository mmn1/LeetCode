package containerWithMostWater;
//利用最短边的增加，尝试是否可以抵消掉。两边距离的减少
public class Solution2 {
	public int maxArea(int[] height) {
		int len = height.length, start = 0, end = len - 1, area = 0;
		while(end > start) {
			area = Math.max(area, Math.min(height[start], height[end]) * (end-start));
			if(height[end]>height[start])
				start++;
			else
				end--;
		}
		return area;
	}
}
