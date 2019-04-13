package binaryTree;

//因为是完全二叉树，所以树的形式是一定的。可以从左往右、从上往下遍历
public class PopulatingNextRightPointersInEachNode2 {
    public void connect(TreeLinkNode root) {
    	TreeLinkNode start = root;
    	while(start != null) {	//只负责从上往下的一个遍历
    		TreeLinkNode cur = start;
    		while(cur != null){		//负责每一层中从左往右的遍历
    			if(cur.left != null)	cur.left.next = cur.right;
    			if(cur.right != null && cur.next != null) {	
    				//如果.next存在的情况下，才可以调用.next.left防止空指针错误
    				cur.right.next = cur.next.left;
    			}
    			cur = cur.next;
    		}
    		start = start.left;
    	}
    }
}
