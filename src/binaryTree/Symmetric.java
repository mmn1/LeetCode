package binaryTree;
//这个代码写的有点拖沓
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
    	//因为前面已经判断过双null事件，所以此处成真，只能是单null
    	boolean res = lNode.val == rNode.val;
    	TreeNode lTemp = lNode, rTemp = rNode;
    	while(lTemp.left != null || rTemp.right != null) {		
    		//既然选择用递归就没必要再用迭代while循环了
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
