package reorderList;

public class SolutionRunDemo {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		Solution sol = new Solution();
		sol.reorderList(l1);
		System.out.println("w");
	}
}
