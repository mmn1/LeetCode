package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
//此解法有点大材小用，因为是完全二叉树，所以如果有子树，那么他们相互之间必然相邻
public class PopulatingNextRightPointersInEachNode {
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> queue = new LinkedList<>();
        if(root == null) {
        	return;
        }
        queue.offer(root);
        while(!queue.isEmpty()) {
        	int size = queue.size();
    		root = queue.poll();	//要提前poll，然后在循环里面只要有一个就可以了
    		if(root.left != null)	
    			queue.add(root.left);
    		if(root.right != null)	
    			queue.add(root.right);
        	for(int i=1; i<size; i++) { 
        		TreeLinkNode hhh = queue.poll();
        		root.next = hhh;
        		root = root.next;
        		if(root.left != null)	queue.add(root.left);	
        		//从队列中取出之后要将下一层，加入到树中
        		if(root.right != null)	queue.add(root.right);
        	}
        	root.next = null;	//本层最后一个已null结尾
        }
    }
}
