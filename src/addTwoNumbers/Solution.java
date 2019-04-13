//package addTwoNumbers;
//
//public class Solution {
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		ListNode sentinel = new ListNode(0);
//        ListNode c1 = l1, c2 = l2;
//		ListNode curr = dummyHead;
//		int carry = 0, sum = 0;
//		while(c1 != null || c2 != null) {
//			sum /= 10;
//			if(c1 != null) {
//				sum += c1.val;
//				c1 = c1.next;
//			}
//			if(c2 != null) {
//				sum += c2.val;
//				c2 = c2.next;
//			}
//			curr.next = new ListNode(sum % 10);
//			curr = curr.next;
//		}
//		if(sum/10 ==1)
//			curr.next = new ListNode(1);
//		return dummyHead.next;
//			int x = (l1 != null? l1.val : 0);
//			int y = (l2 != null? l2.val : 0);
//			sum = x + y + carry;
//			curr.next = new ListNode(sum % 10);
//			carry = sum /10;
//			curr = curr.next;
//			l1 = (l1 != null? l1.next : l1);
//			l2 = (l2 != null? l2.next : l2);
//		}
//		if(carry > 0)
//			curr.next = new ListNode(carry);
//		return dummyHead.next;
//	}
//}
//
//ListNode dummyHead = new ListNode(0);
//ListNode p = l1, q = l2, curr = dummyHead;
//int carry = 0;
//while(p != null || q != null) {
//	int x = (p != null? p.val : 0);
//	int y = (q != null? q.val : 0);
//	int sum = x + y + carry;
//	curr.next = new ListNode(sum % 10);
//	carry = sum /10;
//	curr = curr.next;
//	p = (p != null? p.next : p);
//	q = (q != null? q.next : q);
//}
//if(carry > 0)
//	curr.next = new ListNode(carry);
//return dummyHead.next;