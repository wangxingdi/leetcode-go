package easy;

import domain.ListNode;

/**
 * 160. 相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class Q0160_IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        Q0160_IntersectionOfTwoLinkedLists clazz = new Q0160_IntersectionOfTwoLinkedLists();
        ListNode a = new ListNode(8);

        ListNode b = new ListNode(4);
        ListNode b1 = new ListNode(1);

        ListNode b3 = new ListNode(4);
        ListNode b4 = new ListNode(5);
        b3.next = b4;
        a.next = b3;
        b1.next = a;
        b.next = b1;

        System.out.println(clazz.getIntersectionNode_20201209_2(a, b));
    }

    /**
     * 暴力破解
     * 不知道为什么，该方法在leetcode上测试失败
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode_20201209_1(ListNode headA, ListNode headB) {
        while(headA!=null){
            while(headB!=null){
                if(headA == headB){
                    return headA;
                }else{
                    headB = headB.next;
                }
            }
            headA = headA.next;
        }
        return null;
    }

    /**
     * 一种比较巧妙的算法
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode_20201209_2(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            a = (a==null)?headB:a.next;
            b = (b==null)?headA:b.next;
        }
        return a;
    }
}
