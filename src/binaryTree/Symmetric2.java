package binaryTree;

public class Symmetric2 {
    public boolean isSymmetric(TreeNode root) {
    	if(root == null)	return true;
    	return compare(root.left, root.right);
    }
    public boolean compare(TreeNode lNode, TreeNode rNode) {
    	if(lNode == null && rNode == null)	return true;
    	if(lNode == null || rNode == null)	return false;	
    	//��Ϊǰ���Ѿ��жϹ�˫null�¼������Դ˴����棬ֻ���ǵ�null
    	if(lNode.val != rNode.val)	return false;	//ֵ��ֱͬ�ӷ��ش���
    	return compare(lNode.left, rNode.right) && compare(lNode.right, rNode.left);
    	//��֧��������
    }
}
