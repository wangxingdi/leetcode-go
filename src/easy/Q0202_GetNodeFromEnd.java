package easy;

import domain.ListNode;

/**
 * 面试题 02.02. 返回倒数第 k 个节点
 *
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * 示例：
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 */
public class Q0202_GetNodeFromEnd {

    public static void main(String[] args) {
        Q0202_GetNodeFromEnd clazz = new Q0202_GetNodeFromEnd();
    }

    /**
     * 同向双指针
     * @param head
     * @param k
     * @return
     */
    public int kthToLast(ListNode head, int k) {
        if(head==null){
            return -1;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(k>1 && fast!=null){
            fast = fast.next;
            k--;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
