package binaryTree;

import java.util.ArrayList;
import java.util.List;
//���õݹ�ķ�ʽ�����������
public class BinaryTreeInorderTraversal2 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		helper(root, list);
		return list;
	}
	public void helper(TreeNode tmp, List < Integer > h) {
		if(tmp.left != null) {	//�ȱ���������
			tmp = tmp.left;
			helper(tmp, h);
		}
		h.add(tmp.val);	//û�����������Ͱѵ�ǰ�����뵽list��
		if(tmp.right != null) {
			tmp = tmp.right;
			helper(tmp, h);
		}	//����������������������ص�helper�����Բ���������������
	}
}
