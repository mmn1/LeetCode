package oddEvenLinkedList;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
//		ListNode l6 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
//		l5.next = l6;
		sol.oddEvenList(l1);
		System.out.println("b");
	}
}
