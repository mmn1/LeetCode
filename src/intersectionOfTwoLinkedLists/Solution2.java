package intersectionOfTwoLinkedLists;

public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	int lenA = lengthOfNode(headA), lenB = lengthOfNode(headB);
    	//如果两个链表有交汇的部分，那么从后往前数，两个链表交汇的数量是一致的。
    	//所以可以提前除去不可能交汇的前半部分
    	while(lenA > lenB) {
    		headA = headA.next;
    		lenA--;
    	}
    	while(lenA < lenB) {
    		headB = headB.next;
    		lenB--;
    	}
    	//将两个链表从末尾到前的数量确定成一致的，在对应进行比较
    	while(headA != null) {
    		if(headA == headB) {
    			return headA;
    		}
    		headA = headA.next;
    		headB = headB.next;
    	}
    	return null;
    }
    public int lengthOfNode(ListNode tmp) {		//通过遍历确定每一个链表的长度
    	int res = 0;
    	while(tmp != null) {
    		res++;
    		tmp = tmp.next;
    	}
    	return res;
    }
}
