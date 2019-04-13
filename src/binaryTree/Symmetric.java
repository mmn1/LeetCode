package binaryTree;
//�������д���е����
public class Symmetric {
    public boolean isSymmetric(TreeNode root) {
    	if(root == null)	return true;
    	if(root.left == null && root.right == null)		return true;
    	TreeNode lNode = root.left, rNode = root.right;
    	return isEqual(lNode, rNode);
    }
    public boolean isEqual(TreeNode lNode, TreeNode rNode) {
    	if(lNode == null && rNode == null)		return true;
    	if(lNode == null || rNode == null)	return false;	
    	//��Ϊǰ���Ѿ��жϹ�˫null�¼������Դ˴����棬ֻ���ǵ�null
    	boolean res = lNode.val == rNode.val;
    	TreeNode lTemp = lNode, rTemp = rNode;
    	while(lTemp.left != null || rTemp.right != null) {		
    		//��Ȼѡ���õݹ��û��Ҫ���õ���whileѭ����
    		lTemp = lTemp.left;
    		rTemp = rTemp.right;
    		if((lTemp == null && rTemp != null) || 
        			(lTemp != null && rTemp == null))	return false;
    		res = res && isEqual(lTemp, rTemp);
    	}
    	while(lNode.right != null || rNode.left != null) {
    		lNode = lNode.right;
    		rNode = rNode.left;
    		if((lNode == null && rNode != null) || 
        			(lNode != null && rNode == null))	return false;
    		res = res && isEqual(lNode, rNode);
    	}
    	return res;
    }
}
