package deleteNodeInSinglyLinkedList;

public class Solution {
    public void deleteNode(ListNode node) {
    	//这样就可以不用找到前一个，通过与后一个元素互换位置使得，直接替换。very good！！！
//    	删除 单链表中的节点的某一个节点的常用思路 是将要删除节点的前序节点的指针 指向要删除节点的后序节点
    	// 但是本题 只给出要删除节点的指针 没有给出头指针 无法按照上述思路进行删除
    	// 实际上 总结如下 给定一个节点的指针（单链表） 可以删除 可以实际上删除（释放内存）该节点之后的节点
    	// 因此 分为两个 步骤 1. 将当前节点的值 赋为 下一个节点的值 2. 删除下一个节点
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
}
