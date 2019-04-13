package binaryTree;

public class ValidBinarySearchTree2 {
    public boolean isValidBST(TreeNode root) {
    	if(root == null)	return true;
    	if(root.left == null && root.right == null)	return true;
    	boolean res = isValidBST(root.left) && isValidBST(root.right);
    	
    	TreeNode left = root.left, right = root.right;
    	if(left != null) {
    		while(left.right != null) {
    			left = left.right;
    		}
    		res = res && (left.val < root.val);
    	}
    	if(right != null) {
    		while(right.left != null) {
    			right = right.left;
    		}
    		res = res && (right.val > root.val);
    	}
    	return res;
    }
}
