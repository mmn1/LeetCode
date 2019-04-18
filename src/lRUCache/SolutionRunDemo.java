package lRUCache;

import java.util.LinkedList;
import java.util.List;

public class SolutionRunDemo {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.indexOf(2));
		
	}
}
