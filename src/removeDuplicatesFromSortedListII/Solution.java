package removeDuplicatesFromSortedListII;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp1 = new ListNode(-1);
        ListNode res = tmp1;
        ListNode tmp2 = head;
        if(head == null || head.next == null) {
        	return head;
        }
        int duplicate_f = head.val;
        int first = 0;
        while(tmp2 != null) {
        	if(first == 0) {
        		if(tmp2.val != tmp2.next.val) {
        			tmp1.next = new ListNode(tmp2.val);
        			tmp1 = tmp1.next;
        		}
        		duplicate_f = tmp2.val;
        		tmp2 = tmp2.next;
        		first = 1;
        	}else {
        		if(tmp2.next != null) {
        			if(tmp2.val != tmp2.next.val && tmp2.val != duplicate_f) {
            			tmp1.next = new ListNode(tmp2.val);
            			tmp1 = tmp1.next;
        			}
        		}else {
        			if(tmp2.val != duplicate_f) {
            			tmp1.next = new ListNode(tmp2.val);
            			tmp1 = tmp1.next;
        			}
        		}
    			duplicate_f = tmp2.val;
            	tmp2 = tmp2.next;
        	}
        }
        res = res.next;
        return res;
    }
}
