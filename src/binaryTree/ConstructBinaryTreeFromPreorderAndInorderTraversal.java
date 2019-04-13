package binaryTree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    int preIndex = 0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < inorder.length; i++) {
//            map.put(inorder[i], i);
//        }
//        return helper(preorder, inorder, 0, inorder.length - 1, map);
//    }
//    
//    private TreeNode helper(int[] preorder, int[] inorder, int start, int end, Map<Integer, Integer> map) {
//        if (start > end) return null;
//        TreeNode root = new TreeNode(preorder[preIndex++]);
//        int index = map.get(root.val);
//        root.left = helper(preorder, inorder, start, index - 1, map);
//        root.right = helper(preorder, inorder, index + 1, end, map);
//        return root;

    	Map<Integer, Integer> map = new HashMap<>();
    	for(int i=0; i<inorder.length; i++) {
    		map.put(inorder[i], i);
    	}
    	return helper(preorder, inorder, 0, inorder.length-1, map);
    }
    public TreeNode helper(int[] preorder, int[] inorder, 
    		int start, int end, Map<Integer, Integer> map) {
    	if(start > end || preIndex > preorder.length-1)	return null;
    	TreeNode root = new TreeNode(preorder[preIndex++]);
    	int index = map.get(root.val);
    	root.left = helper(preorder, inorder, start, index-1, map);
    	root.right = helper(preorder, inorder, index+1, end, map);
    	return root;
    }
}
