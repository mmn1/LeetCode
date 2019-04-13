package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
//�˽ⷨ�е���С�ã���Ϊ����ȫ�������������������������ô�����໥֮���Ȼ����
public class PopulatingNextRightPointersInEachNode {
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> queue = new LinkedList<>();
        if(root == null) {
        	return;
        }
        queue.offer(root);
        while(!queue.isEmpty()) {
        	int size = queue.size();
    		root = queue.poll();	//Ҫ��ǰpoll��Ȼ����ѭ������ֻҪ��һ���Ϳ�����
    		if(root.left != null)	
    			queue.add(root.left);
    		if(root.right != null)	
    			queue.add(root.right);
        	for(int i=1; i<size; i++) { 
        		TreeLinkNode hhh = queue.poll();
        		root.next = hhh;
        		root = root.next;
        		if(root.left != null)	queue.add(root.left);	
        		//�Ӷ�����ȡ��֮��Ҫ����һ�㣬���뵽����
        		if(root.right != null)	queue.add(root.right);
        	}
        	root.next = null;	//�������һ����null��β
        }
    }
}
