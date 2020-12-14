package easy;

import domain.ListNode;

/**
 * 剑指 Offer 18. 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 */
public class Q0018_DeleteListNode {

    public static void main(String[] args) {
        Q0018_DeleteListNode clazz = new Q0018_DeleteListNode();
        ListNode a = new ListNode(-3);
        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(-99);
        a1.next = a2;
        a.next = a1;
        System.out.println(clazz.deleteNode(a, -99));
    }


    public ListNode deleteNode(ListNode head, int val) {
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        ListNode cur = tmp;
        while(cur.next!=null){
            if(cur.next.val==val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return tmp.next;
    }
}
