package binaryTree;

import java.util.List;

public class SolutionRunDemo {
	public static void main(String[] args) {
//		TreeNode t1 = new TreeNode(5);
//		TreeNode t2 = new TreeNode(3);
//		TreeNode t3 = new TreeNode(6);
//		TreeNode t4 = new TreeNode(2);
//		TreeNode t5 = new TreeNode(4);
//		TreeNode t6 = new TreeNode(1);
		//TreeNode t6 = new TreeNode(6);
		TreeLinkNode t1 = new TreeLinkNode(5);
		TreeLinkNode t2 = new TreeLinkNode(3);
		TreeLinkNode t3 = new TreeLinkNode(6);
		TreeLinkNode t4 = new TreeLinkNode(2);
		TreeLinkNode t5 = new TreeLinkNode(4);
		TreeLinkNode t6 = new TreeLinkNode(1);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = null;
		t3.right = null;
		t4.left = t6;
		t4.right = null;
		t5.left = null;
		t5.right = null;
		t6.left = null;
		t6.right = null;
//		FindMaxDepth dep = new FindMaxDepth();
//		int res = dep.maxDepth(t1);
//		System.out.println(res);
		
//		ValidBinarySearchTree2 sol = new ValidBinarySearchTree2();
//		boolean res = sol.isValidBST(t1);
//		System.out.println(res);
		
//		Symmetric2 sol = new Symmetric2();
//		boolean res = sol.isSymmetric(t1);
//		System.out.println(res);
		
//		LevelOrderTraversal2 sol = new LevelOrderTraversal2();
//		@SuppressWarnings("unused")
//		List<List<Integer>> list = sol.levelOrder(t1);
//		System.out.println("res");
		
//		ConvertToBST sol = new ConvertToBST();
//		int[] nums = {-10,-3,0,5,9};
//		TreeNode res = sol.sortedArrayToBST(nums);
//		System.out.println("res");
		
//		KthSmallestElementInBST sol = new KthSmallestElementInBST();
//		int res = sol.kthSmallest(t1, 3);
//		System.out.println(res);
		
		PopulatingNextRightPointersInEachNode sol = new PopulatingNextRightPointersInEachNode();
		sol.connect(t1);
	}
}
