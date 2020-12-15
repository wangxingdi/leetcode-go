package easy;

import domain.ListNode;

/**
 * 160. 相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class Q0160_IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        Q0160_IntersectionOfTwoLinkedLists clazz = new Q0160_IntersectionOfTwoLinkedLists();
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(0);
        ListNode b3 = new ListNode(1);

        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);

        c1.next = c2;
        c2.next = c3;

        a1.next = a2;
        a2.next = c1;

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        System.out.println(clazz.getIntersectionNode_20201209_1(a1, b1));
    }

    /**
     * 暴力破解
     * 不知道为什么，该方法在leetcode上测试失败 -- 原因找到，headB没有重置
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode_20201209_1(ListNode headA, ListNode headB) {
        ListNode headBt = headB;
        while(headA!=null){
            while(headBt!=null){
                if(headA == headBt){
                    return headA;
                }else{
                    headBt = headBt.next;
                }
            }
            headA = headA.next;
            headBt = headB;
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
