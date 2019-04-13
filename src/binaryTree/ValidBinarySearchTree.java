package binaryTree;

import java.util.Stack;
//确定二叉查找树是否是正确的
public class ValidBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
    	if(root == null)	return true;
    	Stack<TreeNode> stack = new Stack<>();		//深度遍历非递归，第一步建栈
    	TreeNode pre = null; //测试中间数，方便确定左右大小关系
    	while(root != null || !stack.isEmpty()) {
    		while(root != null) {
    			stack.push(root);
    			root = root.left;
    		}
    		root = stack.pop();
    		if(pre != null && pre.val >= root.val)	return false;
    		//这句话太骚了，真的厉害。因为pre如果测试的时候始终会在顶点上，所以可以。
    		//同时因为赋值前后的不同相对大小关系就会自动进行变化
    		pre = root;
    		root = root.right;
    	}
    	return true;
    }
}
