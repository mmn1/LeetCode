package brickWall;

import java.util.HashMap;
import java.util.List;

public class Solution2 {
    public int leastBricks(List<List<Integer>> wall) {
    	HashMap<Integer, Integer> hm = new HashMap<>();
    	int res = 0;
        //���j+1С�ڿ��Լ���һ���ж϶���Խ��,���������һ������
    	for(int i=0; i<wall.size(); i++) {
    		int sum = 0;
    		for(int j=0; j+1<wall.get(i).size(); j++) {
    			sum += wall.get(i).get(j);
    			hm.put(sum, hm.getOrDefault(sum, 0)+1);
    			res = Math.max(res, hm.get(sum));
    		}
    	}
    	return wall.size() - res;
    }
}
