package courseScheduleII;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Copy {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    	int[] topologicalOrder = new int[numCourses];
    	int[] index = new int[numCourses];
    	Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    	for(int i=0; i<prerequisites.length; i++) {
    		int dest = prerequisites[i][0];
    		int src = prerequisites[i][1];
    		List<Integer> list = map.getOrDefault(src, new LinkedList<Integer>());
    		list.add(dest);
    		map.put(src, list);
    		index[dest]++;
    	}
    	Queue<Integer> queue = new LinkedList<>();
    	for(int i=0; i<numCourses; i++) {
    		if(index[i] == 0) {
    			queue.add(i);
    		}
    	}
    	int i = 0;
    	while(!queue.isEmpty()) {
    		int tmp = queue.remove();
    		topologicalOrder[i++] = tmp;
    		if(map.containsKey(tmp)) {
    			for(int k : map.get(tmp)) {
    				index[k]--;
    				if(index[k] == 0) {
    					queue.add(k);
    				}
    			}
    		}
    	}
    	if(i == numCourses) {
    		return topologicalOrder;
    	}else {
    		return new int[0];
    	}
    }
}
