package singlyLinkedList;

public class SolutionRunDemo {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = null;
		
		ListNode ln11 = new ListNode(0);
		ListNode ln22 = new ListNode(1);
		ln11.next = ln22;
		ln22.next = null;
//		ListNode head = ln1;
		//show(head);
//		ListNode h = null;
//		Reverse sol = new Reverse();
//		ListNode rHead = sol.reverseList(h);
//		show(rHead);
		
//		Merge sol = new Merge();
//		ListNode mHead = sol.mergeTwoLists(ln1, ln11);
//		show(mHead);
		
//		Palindrome sol = new Palindrome();
//		boolean pHead = sol.isPalindrome(ln11);
//		System.out.println(pHead);
		
		Cycle2 sol = new Cycle2();
		boolean cHead = sol.hasCycle(ln11);
		System.out.println(cHead);
		
	}
	public static void show(ListNode head){		
		ListNode tmp = head;		//±È¿˙¥Ú”°¡¥±Ì		
		while(tmp != null){			
			System.out.println("data :"+tmp.val);			
			tmp = tmp.next;		
		}
	}

}
