package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//������������������������������һ�������������
public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root == null)	return list;
		Stack<TreeNode> stack = new Stack<>();	//����һ���µ�ջ
		while(root != null || !stack.isEmpty()) {	
			//��ͬ�����������в�ͬ��ȷ���Ƿ�Ϊ�յķ�ʽ������ȫ��null
			while(root != null) {	//һ·����������������
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
