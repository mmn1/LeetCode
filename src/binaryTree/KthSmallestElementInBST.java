package binaryTree;

import java.util.Stack;

public class KthSmallestElementInBST {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) {
        	return -1;
        }
        int tmp = 1;
        while(root != null || !stack.isEmpty()) {
        	while(root != null) {
        		stack.push(root);
        		root = root.left;
        	}
        	if(tmp == k) {
        		return stack.pop().val;
        	}
        	tmp++;
        	root = stack.pop();
        	root = root.right;
        }
    	return -1;
    }
}
