package easy;

import domain.ListNode;

/**
 * NO_IDEA
 * 141. 环形链表
 * 给定一个链表，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 */
public class Q0141_LinkedListCycle {

    public static void main(String[] args) {
        Q0141_LinkedListCycle clazz = new Q0141_LinkedListCycle();
        ListNode a = new ListNode(3);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(0);
        ListNode a3 = new ListNode(4);
        a2.next = a3;
        a1.next = a2;
        a.next = a1;
        a3.next = a1;
        System.out.println(clazz.hasCycle_20201208_2(a));
    }

    /**
     * 同向快慢指针，在这里是一个错误的思路，存在无限循环
     * @param head
     * @return
     */
    public boolean hasCycle_20201208_1(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        while(head!=null){
            ListNode slow = head.next;
            while(slow!=null){
                if(head==slow){
                    return true;
                }else{
                    slow = slow.next;
                }
            }
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle_20201208_2(ListNode head){
        //没有或者一个
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=slow){
            if(fast==null || fast.next==null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
