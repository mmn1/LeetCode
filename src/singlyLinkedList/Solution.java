package singlyLinkedList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       	int start = n;
		ListNode curr = head;
		for (int i = 0; i < start; i++) {
			curr = curr.next;
		}
		ListNode result = head;
        if(curr==null){
            return head.next;
        }
		while (curr.next != null) {
			curr = curr.next;
			result = result.next;
		}
		result.next=result.next.next;
        return head;
    }
}
