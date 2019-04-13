package binaryTree;

import java.util.ArrayList;
import java.util.List;
//采用递归的方式进行中序遍历
public class BinaryTreeInorderTraversal2 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		helper(root, list);
		return list;
	}
	public void helper(TreeNode tmp, List < Integer > h) {
		if(tmp.left != null) {	//先遍历左子树
			tmp = tmp.left;
			helper(tmp, h);
		}
		h.add(tmp.val);	//没有左子树，就把当前结点加入到list中
		if(tmp.right != null) {
			tmp = tmp.right;
			helper(tmp, h);
		}	//这个，如果有右子树反正会回到helper，所以不用在添加其他语句
	}
}
