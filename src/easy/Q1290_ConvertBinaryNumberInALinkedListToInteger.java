package easy;

import domain.ListNode;

/**
 * 1290. 二进制链表转整数
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 *
 * 请你返回该链表所表示数字的 十进制值 。
 */
public class Q1290_ConvertBinaryNumberInALinkedListToInteger {

    public static void main(String[] args) {
        Q1290_ConvertBinaryNumberInALinkedListToInteger clazz = new Q1290_ConvertBinaryNumberInALinkedListToInteger();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(0);
        a1.next = a2;
        a.next = a1;
        System.out.println(clazz.getDecimalValue(a));
    }

    public int getDecimalValue(ListNode head) {
        int res = 0;
        while(head!=null){
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }

    /**
     * 一开始的思路是：先翻转链表，然后进行加权运算计算出十进制，但是发现这种思路太复杂
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head){
        if(head.next==null){
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }


}
