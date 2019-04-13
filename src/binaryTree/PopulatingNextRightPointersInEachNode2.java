package binaryTree;

//��Ϊ����ȫ������������������ʽ��һ���ġ����Դ������ҡ��������±���
public class PopulatingNextRightPointersInEachNode2 {
    public void connect(TreeLinkNode root) {
    	TreeLinkNode start = root;
    	while(start != null) {	//ֻ����������µ�һ������
    		TreeLinkNode cur = start;
    		while(cur != null){		//����ÿһ���д������ҵı���
    			if(cur.left != null)	cur.left.next = cur.right;
    			if(cur.right != null && cur.next != null) {	
    				//���.next���ڵ�����£��ſ��Ե���.next.left��ֹ��ָ�����
    				cur.right.next = cur.next.left;
    			}
    			cur = cur.next;
    		}
    		start = start.left;
    	}
    }
}
