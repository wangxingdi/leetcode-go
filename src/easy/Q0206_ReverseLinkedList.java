package easy;

import domain.ListNode;

/**
 * 206. 反转链表
 * 反转一个单链表。
 *
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class Q0206_ReverseLinkedList {
    public static void main(String[] args) {
        Q0206_ReverseLinkedList clazz = new Q0206_ReverseLinkedList();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        a3.next = a4;
        a2.next = a3;
        a1.next = a2;
        a.next = a1;
        System.out.println(clazz.reverseList_20201210_3(a));
    }

    /**
     * 这是一种错误的解法，死循环
     * @param head
     * @return
     */
    public ListNode reverseList_20201210_1(ListNode head) {
        if(head==null){
            return null;
        }
        while(head.next!=null){
            head.next.next = head;
            ListNode tmp = head.next;
            head.next = null;
            head = tmp;
        }
        return head;
    }

    /**
     * 两个指针同速移动，迭代法
     * @param head
     * @return
     */
    public ListNode reverseList_20201210_2(ListNode head){
        if(null==head){
            return null;
        }
        ListNode curr = null;
        ListNode next = head;
        while(next!=null){
            //暂存
            ListNode tmp = next.next;
            next.next = curr;
            curr = next;
            next = tmp;
        }
        return curr;
    }

    /**
     * 递归法
     * @param head
     * @return
     */
    public ListNode reverseList_20201210_3(ListNode head) {
        if(null==head || head.next==null){
            return head;
        }
        ListNode res = reverseList_20201210_3(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}
