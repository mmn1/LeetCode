package binaryTree;

import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> list = new LinkedList<List<Integer>>(); 
    	//二维List初始化，里面的List不用加()
    	if(root == null)	return list;
    	
    	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    	LinkedList<TreeNode> queue2 = new LinkedList<TreeNode>();
    	//这里是采用两个队列来进行计数
    	Integer temp;
    	queue.offer(root);
    	queue2.offer(root);
    	while(!queue.isEmpty()) {
    		List<Integer> list2 = new LinkedList<Integer>();
    		while(!queue.isEmpty()) {
    			temp = queue.poll().val;
    			list2.add(temp);
    		}
    		list.add(list2);
    		while(!queue2.isEmpty()) {
        		root = queue2.poll();
        		if(root.left != null)	queue.offer(root.left);
        		if(root.right != null)	queue.offer(root.right);
    		}
    		queue2.addAll(queue);
    	}
    	return list;
    }
}



//if(root == null)	return list;
//List<Integer> list2 = new LinkedList<Integer>();
//LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
//LinkedList<TreeNode> queue2 = new LinkedList<TreeNode>();
//TreeNode temp;
//queue.offer(root);
//while(!queue.isEmpty()) {
//	temp = queue.poll();
//	
//}