package binaryTree;

public class Symmetric2 {
    public boolean isSymmetric(TreeNode root) {
    	if(root == null)	return true;
    	return compare(root.left, root.right);
    }
    public boolean compare(TreeNode lNode, TreeNode rNode) {
    	if(lNode == null && rNode == null)	return true;
    	if(lNode == null || rNode == null)	return false;	
    	//因为前面已经判断过双null事件，所以此处成真，只能是单null
    	if(lNode.val != rNode.val)	return false;	//值不同直接返回错误
    	return compare(lNode.left, rNode.right) && compare(lNode.right, rNode.left);
    	//分支调用子树
    }
}
