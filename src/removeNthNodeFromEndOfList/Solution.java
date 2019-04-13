package removeNthNodeFromEndOfList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head == null)	return head;
        ListNode fast = head, mid = head, slow = head;
        int num = 0;
        for(int i=0; i<n && fast != null; i++) {
        	fast = fast.next;
        }
        if(fast == null) {
        	head = head.next;
        	return head;
        }
        while(fast != null) {
        	mid = fast;
        	num = 0;
        	for(int i=0; i<n && fast != null; i++) {
            	fast = fast.next;
            	num++;
            }
        	if(fast == null)	break;
        	slow = mid;
        }
        for(int i=1; i<num; i++) {
        	slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
