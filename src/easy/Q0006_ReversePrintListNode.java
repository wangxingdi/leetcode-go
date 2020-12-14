package easy;

import domain.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class Q0006_ReversePrintListNode {

    public static void main(String[] args) {
        Q0006_ReversePrintListNode clazz = new Q0006_ReversePrintListNode();
    }


    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        reverse(head, list);
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    public ListNode reverse(ListNode head, List<Integer> list){
        if(head==null){
            return head;
        }
        ListNode node = reverse(head.next, list);
        //注意这里
        list.add(head.val);
        return node;
    }
}
