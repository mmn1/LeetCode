package singlyLinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Merge {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode temp, res;
    	if(l1 == null) {
    		return l2;
    	}else if(l2 == null) {
    		return l1;
    	}
    	if(l1.val <= l2.val) {
			temp = l1;
			res = temp;
			l1 = l1.next;
		}else {
			temp = l2;
			res = temp;
			l2 = l2.next;
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
    	return res;
    }
}
