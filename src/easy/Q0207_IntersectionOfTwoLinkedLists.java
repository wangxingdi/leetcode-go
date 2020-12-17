package easy;

import domain.ListNode;

/**
 * 面试题 02.07. 链表相交
 * 给定两个（单向）链表，判定它们是否相交并返回交点。请注意相交的定义基于节点的引用，而不是基于节点的值。换句话说，如果一个链表的第k个节点与另一个链表的第j个节点是同一节点（引用完全相同），则这两个链表相交。
 */
public class Q0207_IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        Q0207_IntersectionOfTwoLinkedLists clazz = new Q0207_IntersectionOfTwoLinkedLists();
    }

    /**
     * 暴力破解
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {
        ListNode b = headB;
        if(headA==null || b==null){
            return null;
        }
        while(headA!=null){
            while(b!=null){
                if(headA==b){
                    return headA;
                }else{
                    b = b.next;
                }
            }
            headA = headA.next;
            b = headB;
        }
        return null;
    }

    /**
     * 循环法
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            a = (a==null)?headB:a.next;
            b = (b==null)?headA:b.next;
        }
        return a;
    }

}
