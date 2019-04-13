package binaryTree;

import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal2 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new LinkedList<List<Integer>>(); 
    	//��άList��ʼ���������List���ü�()
    	if(root == null)	{
    		return list;
    	}
    	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	while(!queue.isEmpty()) {
			List<Integer> list2 = new LinkedList<Integer>();
    		int size = queue.size();	//��ÿһ����еĽڵ�������¼����
    		for(int i=0; i<size; i++) {	
    			//ͨ������ѭ����������Ƕ�ף�����ɶԶ��еı�������������O(n)��ʱ������
    			TreeNode temp = queue.poll();
    			if(temp.left != null) {
    				queue.add(temp.left);
    			}
    			if(temp.right != null) {
    				queue.add(temp.right);
    			}
    			list2.add(temp.val);
    		}
    		list.add(list2); 
    	}
    	return list;
	}
}
