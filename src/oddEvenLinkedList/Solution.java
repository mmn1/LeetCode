package oddEvenLinkedList;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
    	if(head == null || head.next == null || head.next.next == null)	
    		return head;
    	ListNode tmp = head.next;	//ż����
    	ListNode tmp1 = head.next;	//Ϊ�˱���ż����ĳ�ʼ��λ��
    	ListNode k = head;		//������
    	boolean n = true;
    	while(k.next != null || tmp.next != null) {
    		if(n) {
    			k.next = tmp.next;
    			k = k.next;
    			n = false;
    		}else {
    			tmp.next = k.next;
    			tmp = tmp.next;
    			n = true;
    		}
    		if(!n && k.next == null && tmp.next != null) {
    			tmp.next = null;
    		}
    		if(!n && k.next == null) {
    			k.next = tmp1;
    			break;
    		}
    		if(n && tmp.next == null) {
    			k.next = tmp1;
    			break;
    		}
    	}
    	return head;
    }
}
