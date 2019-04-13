package binaryTree;

public class ConvertToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums == null || nums.length ==0 ) {
    		return null;
    	}
    	TreeNode root = sort(nums, 0, nums.length-1);
    	//����һ������ֵ��һ��Ҫ�Լ���ʼ��������ͨ�������ķ���ֵ����ʼ��������������еݹ����
    	return root;
    }
    public TreeNode sort(int[] nums, int start, int end) {
    	//���۰���ҵ�˼·������
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
