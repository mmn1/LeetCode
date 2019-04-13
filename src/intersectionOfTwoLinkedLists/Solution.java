package intersectionOfTwoLinkedLists;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode a = headA, b = headB;
        while(a != null) {
        	set.add(a);
        	a = a.next;
        }
        while(b != null) {
        	if(set.contains(b)) {	//因为这是一个对象，所以如果一样的话其子对象也是一样的
        		return b;
        	}
        	b = b.next;
        }
        return null;
    }
}
