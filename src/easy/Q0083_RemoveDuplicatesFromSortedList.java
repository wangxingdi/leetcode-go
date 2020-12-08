package easy;

import domain.ListNode;

/**
 * JUST_ONCE
 * 83. 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 * 输入: 1->1->2
 * 输出: 1->2
 *
 * 示例 2:
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class Q0083_RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        Q0083_RemoveDuplicatesFromSortedList clazz = new Q0083_RemoveDuplicatesFromSortedList();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        a1.next = a2;
        a.next = a1;
        System.out.println(clazz.deleteDuplicates(a));
    }

    public ListNode deleteDuplicates(ListNode head){
        if(head==null){
            return null;
        }
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}
