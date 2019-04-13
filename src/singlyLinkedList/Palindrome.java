package singlyLinkedList;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
    	int count = 0;
    	ListNode temp = head, res;
    	while(temp != null) {
    		temp = temp.next;
    		count++;
    	}
    	temp = head;
    	int hLen = (count % 2 == 0) ? count / 2 : count / 2 + 1;
    	for(int i=0; i<hLen; i++) {
    		temp = temp.next;
    	}
    	res = reverseList(temp);
    	while(res != null) {
    		if(res.val != head.val) {
    			return false;
    		}
    		res = res.next;
    		head = head.next;
    	}
    	return true;
    }
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
