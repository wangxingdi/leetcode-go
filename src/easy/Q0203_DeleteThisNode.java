package easy;

import domain.ListNode;

/**
 * 面试题 02.03. 删除中间节点
 * 我觉得名字应该叫：删除当前节点
 * 实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
 *
 * 示例：
 * 输入：单向链表a->b->c->d->e->f中的节点c
 * 结果：不返回任何数据，但该链表变为a->b->d->e->f
 */
public class Q0203_DeleteThisNode {

    public static void main(String[] args) {
        Q0203_DeleteThisNode clazz = new Q0203_DeleteThisNode();
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        a2.next = a3;
        a1.next = a2;
        a.next = a1;
        System.out.println(a);
        //为什么进行a2 = a3赋值后，两次输出结果一致?
        a2 = a3;
        System.out.println(a);
    }

    /**
     * 如果只能访问当前节点，那么该题的解题思路就是，将自己变成其他节点。
     * 举个例子：A->B->C->D
     * 如果要删掉 B 节点，那么只需要将 B 变为 C，再把 B 的指针指向 D，即可完成。
     * @param node
     */
    public void deleteNode(ListNode node) {
        if(node==null || node.next==null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
