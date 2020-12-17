package easy;

import domain.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 02.06. 回文链表
 *
 * 编写一个函数，检查输入的链表是否是回文的。
 * 示例 1：
 * 输入： 1->2
 * 输出： false
 *
 * 示例 2：
 * 输入： 1->2->2->1
 * 输出： true
 */
public class Q0206_PalindromeListNode {

    public static void main(String[] args) {
        Q0206_PalindromeListNode clazz = new Q0206_PalindromeListNode();
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(0);
        ListNode a3 = new ListNode(1);
        a1.next = a2;
        a2.next = a3;
        System.out.println(clazz.reverse(a1));
    }

    /**
     * 使用List作为缓存
     * @param head
     * @return
     */
    public boolean isPalindrome_1(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        //从两边到中间
        int i = 0;
        int j = list.size() - 1;
        while(i<j){
            if(!list.get(i++).equals(list.get(j--))){
                return false;
            }
        }
        return true;
    }

    /**
     * 中间翻转链表
     * @param head
     * @return
     */
    public boolean isPalindrome_2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = reverse(slow);
        while(head!=null && right!=null){
            if(head.val!=right.val){
                return false;
            }
            head = head.next;
            right = right.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode node = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

}
