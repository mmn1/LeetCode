package binaryTree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<>();
		if(root == null)	return list;
		helper(root, list);
		return list;
	}
	public void helper(TreeNode r, List<Integer> l) {
		l.add(r.val);
		if (r.left != null) {
			TreeNode rr = r.left;
			helper(rr, l);
		}
		if (r.right != null) {
			r = r.right;
			helper(r, l);
		}
	}
}
