package easy;

import domain.ListNode;

/**
 * 203. 移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class Q0203_RemoveLinkedListElements {

    public static void main(String[] args) {
        Q0203_RemoveLinkedListElements clazz = new Q0203_RemoveLinkedListElements();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        a1.next = a2;
        a.next = a1;
        System.out.println(clazz.removeElements(a, 2));
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        ListNode cur = tmp;
        while(cur.next!=null){
            if(cur.next.val==val){
                if(cur.next.next == null){
                    cur.next = null;
                }else{
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }
        }
        return tmp.next;
    }
}
