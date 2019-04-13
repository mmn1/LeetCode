package brickWall;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
    	int lens = 0;
    	int high = wall.size();
    	for(int i=0; i<wall.get(0).size(); i++) {
    		lens += wall.get(0).get(i);
    	}
    	int[] record = new int[lens];
    	for(int i=0; i<high; i++) {
    		int sum = 0;
    		for(int j=0; j<wall.get(i).size(); j++) {
    			sum += wall.get(i).get(j);
    			record[sum-1] += 1;
    		}
    	}
    	Arrays.sort(record);
        if(lens<2)   return high;
    	return high - record[lens-1];
    }
}
