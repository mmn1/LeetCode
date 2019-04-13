package singlyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class Cycle {
    public boolean hasCycle(ListNode head) {
    	Set<ListNode> set = new HashSet<>();
    	if(head == null) {
    		return false;
    	}
    	while(head != null) {
    		if(!set.add(head)) {
    			return true;
    		}
    		head = head.next;
    	}
    	return false;
    }
}
