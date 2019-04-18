package lRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache2 {
	private int capacity;
	private Map<Integer, Node> map;
	Node first;
	Node last;
	
    public LRUCache2(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        first = null;
        last = null;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
        	Node n = map.get(key);
        	delete(n);
        	addFirst(n);
        	return n.v;
        }else {
        	return -1;
        }
    }
    
    public void put(int key, int value) {
    	Node n;
        if(map.containsKey(key)) {
        	n = map.get(key);
        	delete(n);
        	addFirst(n);
        	n.v = value;
        }else {
        	if(map.size() == capacity) {
        		map.remove(last.k);
        		delete(last);
        	}
        	n = new Node(key, value);
        	map.put(key, n);
        	addFirst(n);
        }
    }
    
    public void addFirst(Node n) {
    	if(first != null) {
    		first.pre = n;
    	}
    	n.pre = null;
    	n.next = first;
    	first = n;
    	if(last == null) {
    		last = n;
    	}
    }
    public void delete(Node n) {
    	if(n.pre == null) {
    		first = n.next;
    	}else {
    		n.pre.next = n.next;
    	}
    	
    	if(n.next == null) {
    		last = n.pre;
    	}else {
    		n.next.pre = n.pre;
    	}
    }
    
}
class Node {
	Node pre;
	Node next;
	int k;
	int v;
	Node(int k, int v){
		this.k = k;
		this.v = v;
		this.pre = null;
		this.next = null;
	}
}
