package binaryTree;

import java.util.Stack;
//ȷ������������Ƿ�����ȷ��
public class ValidBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
    	if(root == null)	return true;
    	Stack<TreeNode> stack = new Stack<>();		//��ȱ����ǵݹ飬��һ����ջ
    	TreeNode pre = null; //�����м���������ȷ�����Ҵ�С��ϵ
    	while(root != null || !stack.isEmpty()) {
    		while(root != null) {
    			stack.push(root);
    			root = root.left;
    		}
    		root = stack.pop();
    		if(pre != null && pre.val >= root.val)	return false;
    		//��仰̫ɧ�ˣ������������Ϊpre������Ե�ʱ��ʼ�ջ��ڶ����ϣ����Կ��ԡ�
    		//ͬʱ��Ϊ��ֵǰ��Ĳ�ͬ��Դ�С��ϵ�ͻ��Զ����б仯
    		pre = root;
    		root = root.right;
    	}
    	return true;
    }
}
