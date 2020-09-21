package easy;

import domain.ListNode;
import util.DateUtils;

/**
 * Day2: 今天是系统性刷题的第二天，期望满满。
 *
 * 给出两个"非空"的链表用来表示两个非负的整数。其中，它们各自的位数是按照"逆序"的方式存储的，
 * 并且它们的每个节点只能存储"一位"数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q0002_AddTwoNumbers {

    public static void main(String[] args) {
        String timestamp = DateUtils.getTimestamp();
        System.out.println("===当前时间戳: "+timestamp);
        Q0002_AddTwoNumbers clazz = new Q0002_AddTwoNumbers();
        ListNode head1 = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        head1.next = node1;
        node1.next = node2;
        ListNode head2 = new ListNode(5);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(4);
        head2.next = node3;
        node3.next = node4;

        //方式1
        ListNode listNode_20200921101709 = clazz.addTwoNumbers_20200921101709(head1, head2);
        System.out.println(listNode_20200921101709);
    }

    /**
     *
     * 1. 需要考虑两个链表的长度可能不一致；
     * 2. 因为链表的长度不一致，可能会在遍历的过程中出现空指针的情况；
     * 执行结果：通过
     * 执行用时：2 ms, 在所有 Java 提交中击败了 99.88% 的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了 79.41% 的用户
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers_20200921101709(ListNode l1, ListNode l2){
        //进位和最终结果
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        while(l1!=null || l2!=null){
            int add1 = l1==null?0:l1.val;
            int add2 = l2==null?0:l2.val;
            int sum = add1 + add2 + carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            tmp.next = node;
            tmp = tmp.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        //错误点2: 在循环结束后，没有判断carry是否为0
        if(carry!=0){
            ListNode node = new ListNode(carry);
            tmp.next = node;
        }
        //错误点1: 由于res在不断的移动，所以直接返回res也就意味着只返回了链表的最后一个节点。
//        return res;
        return res.next;
    }

    /**
     * 如果两个链表并非逆序存储，而是顺序存储，该如何处理呢？
     * 1. 首先需要确定一件事情，数字的加法从低位向高位运算简单。反之，则需要不断的回溯判断是否有进位；
     * 2. 考虑一下：如何反转一个链表？
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);

        return res.next;
    }

}
