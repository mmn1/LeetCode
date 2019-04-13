package containerWithMostWater;
//������̱ߵ����ӣ������Ƿ���Ե����������߾���ļ���
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
