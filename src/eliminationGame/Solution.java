package eliminationGame;

// 内存超出限制
public class Solution {
    public int lastRemaining(int n) {
    	if(n == 1)	return 1;
    	boolean[] select = new boolean[n];
    	int pos = 0, res = 0;
    	while(pos < n) {
    		boolean is = true;
    		for(int i=0; i<n; i++) {
    			if(!select[i]) {
    				if(is) {
    					select[i] = true;
    					res = i;
    					is = false;
    					pos++;
    				}else {
    					is = true;
    				}
    			}
    		}
    		is = true;
    		for(int i=n-1; i>=0; i--) {
    			if(!select[i]) {
	    			if(is) {
						select[i] = true;
						res = i;
						is = false;
						pos++;
					}else {
						is = true;
					}
	    		}
    		}
    	}
    	return res+1;
    }
}

// 就当学习一下怎么自动化创建链表了
//Node head = new Node(1), tail = null, tmp = null;
//head.pre = null;
//tmp = head;
//int num = 2;
//while(num <= n) {
//	Node k = new Node(num);
//	tmp.next = k;
//	k.pre = tmp;
//	tmp = k;
//	if(num == n) {
//		tail = k;
//		tail.next = null;
//	}
//}
//class Node {
//	public int val;
//	public Node next;
//	public Node pre;
//	Node(int n){
//		val = n;
//	}
//}
