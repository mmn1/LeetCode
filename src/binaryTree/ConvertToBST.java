package binaryTree;

public class ConvertToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums == null || nums.length ==0 ) {
    		return null;
    	}
    	TreeNode root = sort(nums, 0, nums.length-1);
    	//创建一个返回值不一定要自己初始化，可以通过函数的返回值来初始化。这样方便进行递归过程
    	return root;
    }
    public TreeNode sort(int[] nums, int start, int end) {
    	//与折半查找的思路相类似
    	if(start > end) {	//done
    		return null;
    	}
    	int mid = (start + end) / 2;
    	TreeNode node = new TreeNode(nums[mid]);
		node.left = sort(nums, start, mid-1);
		node.right = sort(nums, mid+1, end);
    	return node;
    }
}
