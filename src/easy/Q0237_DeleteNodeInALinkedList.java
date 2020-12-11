package easy;

import domain.ListNode;

/**
 * 237. 删除链表中的节点
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
 *
 * 示例 1：
 * 输入：head = [4,5,1,9], node = 5
 * 输出：[4,1,9]
 * 解释：给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 */
public class Q0237_DeleteNodeInALinkedList {

    public static void main(String[] args) {
        Q0237_DeleteNodeInALinkedList clazz = new Q0237_DeleteNodeInALinkedList();
        ListNode a = new ListNode(4);
        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(9);
        a2.next = a3;
        a1.next = a2;
        a.next = a;
        clazz.deleteNode(a1);
    }

    /**
     * 一道十分无语的题目
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
