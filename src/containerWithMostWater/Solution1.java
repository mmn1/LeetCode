package containerWithMostWater;

public class Solution1 {
	public int maxArea(int[] height) {
		int len = height.length, area = 0, start = 0, end = 0;
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(j+1<len)
					if(height[j]<height[j+1])
						continue;
				int temp = height[i]>height[j]? height[j]: height[i];
				int tempArea = temp*(j-i);
				if(tempArea > area) {
					start = i;
					end = j;
					area = tempArea;
				}
			}
		}
		return area;
	}
}
