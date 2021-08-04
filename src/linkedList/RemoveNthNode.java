package linkedList;

/**
 * Created by cuixiaodao on 12/23/2017
 * for leetCode problem:
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 */

public class RemoveNthNode{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 令first, second距离为n,first到达链表末尾时，second导到倒数第n个节点
        ListNode first = head, second = head;        
                
        while(n-- > 0) first = first.next;
        
        if(first == null) return head.next;

        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }    
}
