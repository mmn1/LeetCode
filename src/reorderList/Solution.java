package reorderList;

public class Solution {
    public void reorderList(ListNode head) {
        ListNode fast = head, slow = head;
        if(head == null || head.next == null) {
        	return;
        }
        while(fast != null && fast.next != null) {
        	fast = fast.next.next;
        	if(fast == null) {
            	ListNode mid = slow.next;
            	slow.next = null;
            	slow = mid;
        	}else if(fast.next == null) {
        		slow = slow.next;
        		ListNode mid = slow.next;
            	slow.next = null;
            	slow = mid;
        	}else {
        		slow = slow.next;
        	}
        }
        
        //再将链表反转过来
        ListNode tmp = null;
        while(slow != null) {
        	ListNode mid = slow.next;
        	slow.next = tmp;
        	tmp = slow;
        	slow = mid;
        }
        fast = head;
        slow = tmp;
        while(slow != null) {
        	ListNode mid1 = fast.next;
        	ListNode mid2 = slow.next;
        	fast.next = slow;
        	fast.next.next = mid1;
        	fast = mid1;
        	slow = mid2;
        }
    }
}
