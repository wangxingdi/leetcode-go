package easy;

import domain.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 * 输入: 1->2
 * 输出: false
 *
 * 示例 2:
 * 输入: 1->2->2->1
 * 输出: true
 *
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class Q0234_PalindromeLinkedList {

    public static void main(String[] args) {
        Q0234_PalindromeLinkedList clazz = new Q0234_PalindromeLinkedList();

    }

    /**
     * 使用list缓存数据，然后通过list判断
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        ListNode curr = head;
        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }
        int start = 0;
        int stop = list.size() - 1;
        while(start<=stop){
            if(!list.get(start).equals(list.get(stop))){
                return false;
            }
            start++;
            stop--;
        }
        return true;
    }

    /**
     * 是否可以前半部分正序，后半部分逆序进行比较
     * 递归逆序
     */
}
