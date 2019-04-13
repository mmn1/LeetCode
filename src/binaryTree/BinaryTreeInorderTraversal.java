package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//将二叉排序树，进行中序遍历。输出一个排完序的数组
public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root == null)	return list;
		Stack<TreeNode> stack = new Stack<>();	//创建一个新的栈
		while(root != null || !stack.isEmpty()) {	
			//不同的数据类型有不同的确定是否为空的方式，不能全用null
			while(root != null) {	//一路向左子树遍历到底
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			list.add(root.val);
			root = root.right;
		}
		return list;
	}
}
