package easy;

import domain.ListNode;

/**
 * JUST_ONCE
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Q0021_MergeTwoSortedLists {

    public static void main(String[] args) {
        Q0021_MergeTwoSortedLists clazz = new Q0021_MergeTwoSortedLists();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4);
        a1.next = a2;
        a.next = a1;
        ListNode b = new ListNode(1);
        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(4);
        b1.next = b2;
        b.next = b1;
        System.out.println(clazz.mergeTwoLists20201208(a, b));
    }

    /**
     * 新建一个链表作为返回值
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists20201208(ListNode l1, ListNode l2){
        ListNode res = new ListNode(-1);
        ListNode tmp = res;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                tmp.next = l2;
                l2 = l2.next;
            }else{
                tmp.next = l1;
                l1 = l1.next;
            }
            tmp = tmp.next;
        }
        if(l1!=null){
            tmp.next = l1;
        }
        if(l2!=null){
            tmp.next = l2;
        }
        return res.next;
    }

    /**
     * 如果不允许新建一个链表，该如何处理
     *
     */

}
