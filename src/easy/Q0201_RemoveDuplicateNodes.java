package easy;

import domain.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 02.01. 移除重复节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 *
 * 示例1:
 *  输入：[1, 2, 3, 3, 2, 1]
 *  输出：[1, 2, 3]
 */
public class Q0201_RemoveDuplicateNodes {

    public static void main(String[] args) {
        Q0201_RemoveDuplicateNodes clazz = new Q0201_RemoveDuplicateNodes();
    }

    /**
     * 使用缓存
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> set = new HashSet<Integer>();
        if(head==null || head.next==null){
            return head;
        }
        ListNode cur = head;
        while(cur.next!=null){
            set.add(cur.val);
            if(set.contains(cur.next.val)){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }


}
