package singlyLinkedList;

public class Reverse {
    public ListNode reverseList(ListNode head) {
    	ListNode res = head, tmp;
    	if(head == null || head.next == null) {
    		return head;
    	}
    	ListNode  temp = head.next;
    	res.next = null;
    	while(temp != null) {
    		tmp = temp.next;
    		temp.next = res;
    		res = temp;
    		temp = tmp;
    	}
    	return res;
    }
}
