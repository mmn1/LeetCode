package binaryTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> res = new LinkedList<>();
    	Queue<TreeNode> queue = new LinkedList<>();
    	if(root == null) {
    		return res;
    	}
    	queue.offer(root);
    	boolean isOrNot = true;
    	while(!queue.isEmpty()) {
    		List<Integer> list = new LinkedList<>();
    		int num = queue.size();
    		for(int i=0; i<num; i++) {
    			TreeNode tmp = queue.poll();
    			if(tmp.left != null) {
    				queue.offer(tmp.left);
    			}
    			if(tmp.right != null) {
    				queue.offer(tmp.right);
    			}
    			list.add(tmp.val);
    		}
    		if(isOrNot) {
    			res.add(list);
                isOrNot = false;
    		}else {
    			Collections.reverse(list);//直接对一个链表进行倒转
    			res.add(list);
                isOrNot = true;
    		}
    	}
    	return res;
    }
}
