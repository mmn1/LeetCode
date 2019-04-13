package binaryTree;

import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal2 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new LinkedList<List<Integer>>(); 
    	//二维List初始化，里面的List不用加()
    	if(root == null)	{
    		return list;
    	}
    	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	while(!queue.isEmpty()) {
			List<Integer> list2 = new LinkedList<Integer>();
    		int size = queue.size();	//将每一层具有的节点数都记录下来
    		for(int i=0; i<size; i++) {	
    			//通过两个循环接力（非嵌套）来完成对队列的遍历，但是这是O(n)的时间消耗
    			TreeNode temp = queue.poll();
    			if(temp.left != null) {
    				queue.add(temp.left);
    			}
    			if(temp.right != null) {
    				queue.add(temp.right);
    			}
    			list2.add(temp.val);
    		}
    		list.add(list2); 
    	}
    	return list;
	}
}
