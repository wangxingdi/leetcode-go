package easy;

import domain.ListNode;

/**
 * 剑指 Offer 24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class Q0024_ReverseListNode {

    public static void main(String[] args) {
        Q0024_ReverseListNode clazz = new Q0024_ReverseListNode();
    }

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode reverseList_1(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode node = reverseList_1(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    /**
     * 迭代
     */
    public ListNode reverseList_2(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode cur = null;
        ListNode next = head;
        while(next!=null){
            ListNode tmp = next.next;
            next.next = cur;
            cur = next;
            next = tmp;
        }
        return cur;
    }
}
