package easy;

import domain.ListNode;

/**
 * 876. 链表的中间结点
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class Q0876_MiddleOfTheLinkedList {

    public static void main(String[] args) {
        Q0876_MiddleOfTheLinkedList clazz = new Q0876_MiddleOfTheLinkedList();
    }

    /**
     * 双指针快慢同向
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
