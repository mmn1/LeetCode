package palindromeLinkedList;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null) {	//对于一个单链表求其中间值的快捷方法
        	fast = fast.next.next;
        	slow = slow.next;
        }
        if(fast != null) {
        	slow = slow.next;
        }
        slow = reverse(slow);
        while(slow != null) {
        	if(slow.val != head.val) {
        		return false;
        	}
        	slow = slow.next;
        	head = head.next;
        }
        return true;
    }
    //反转一个单链表
    public ListNode reverse(ListNode head) {
    	ListNode temp = null;
    	while(head != null) {
    		ListNode next = head.next;
    		head.next = temp;
    		temp = head;
    		head = next;
    	}
    	return temp;
    }
}
