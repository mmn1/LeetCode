package lRUCache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache {
	private int capacity;
	private Map<Integer, Integer> map;
	private List<Integer> list;
	
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.list = new LinkedList<>();
    }
    
    public int get(int key) {
    	if(map.containsKey(key)) {
    		int size = list.indexOf(key);
        	list.remove(size);
        	list.add(0, key);
        	return map.get(key);
    	}else {
    		return -1;
    	}
    }
    
    public void put(int key, int value) {
    	if(map.size() == capacity) {
    		int size = list.size();
    		if(!map.containsKey(key)) {
            	map.remove(list.get(size -1));
            	map.put(key, value);
	    		list.remove(size - 1);
	    		list.add(0, key);
            }else {
            	map.put(key, value);
            	size = list.indexOf(key);
            	list.remove(size);
            	list.add(0, key);
            }
    	}else {
    		if(!map.containsKey(key)) {
            	map.put(key, value);
            	list.add(0, key);
            }else {
            	map.put(key, value);
            	int size = list.indexOf(key);
            	list.remove(size);
            	list.add(0, key);
            }
    	}
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */