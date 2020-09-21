package domain;

/**
 * 链表节点
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x){
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
