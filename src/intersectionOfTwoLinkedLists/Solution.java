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
        	if(set.contains(b)) {	//��Ϊ����һ�������������һ���Ļ����Ӷ���Ҳ��һ����
        		return b;
        	}
        	b = b.next;
        }
        return null;
    }
}
