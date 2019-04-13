package pascalTriangle;

import java.util.List;
import java.util.LinkedList;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if(numRows == 0) {
			return list;
		}
		List<Integer> li = new LinkedList<>();
		li.add(1);
		list.add(li);
		if(numRows == 1) {
			return list;
		}
		List<Integer> li1 = new LinkedList<>();
		li1.add(1);li1.add(1);
		list.add(li1);
		if(numRows == 2) {
			return list;
		}
		
		for(int i=2; i<numRows; i++) {
			List<Integer> li11 = new LinkedList<>();
			li11.add(1);
			for(int j=1; j<i; j++) {
				li11.add(j, list.get(i-1).get(j-1)+list.get(i-1).get(j));
			}
			li11.add(1);
			list.add(li11);
		}
		return list;
    }
}
