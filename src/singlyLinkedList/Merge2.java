package singlyLinkedList;

public class Merge2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode temp = new ListNode(-1);
    	ListNode res = temp;
    	if(l1 == null) {
    		return l2;
    	}else if(l2 == null) {
    		return l1;
    	}
    	while(l1 != null && l2 != null) {
    		if(l1.val <= l2.val) {
    			temp.next = l1;
    			l1 = l1.next;
    		}else {
    			temp.next = l2;
    			l2 = l2.next;
    		}
			temp = temp.next;
    	}
    	if(l1 == null) {
    		temp.next = l2;
    	}else if(l2 == null) {
    		temp.next = l1;
    	}
    	return res.next;
    }
}
