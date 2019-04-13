package intersectionOfTwoLinkedLists;

public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	int lenA = lengthOfNode(headA), lenB = lengthOfNode(headB);
    	//������������н���Ĳ��֣���ô�Ӻ���ǰ���������������������һ�µġ�
    	//���Կ�����ǰ��ȥ�����ܽ����ǰ�벿��
    	while(lenA > lenB) {
    		headA = headA.next;
    		lenA--;
    	}
    	while(lenA < lenB) {
    		headB = headB.next;
    		lenB--;
    	}
    	//�����������ĩβ��ǰ������ȷ����һ�µģ��ڶ�Ӧ���бȽ�
    	while(headA != null) {
    		if(headA == headB) {
    			return headA;
    		}
    		headA = headA.next;
    		headB = headB.next;
    	}
    	return null;
    }
    public int lengthOfNode(ListNode tmp) {		//ͨ������ȷ��ÿһ������ĳ���
    	int res = 0;
    	while(tmp != null) {
    		res++;
    		tmp = tmp.next;
    	}
    	return res;
    }
}
