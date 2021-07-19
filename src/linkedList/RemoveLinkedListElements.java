package linkedList;

/**
 * Created by cuixiaodao on 12/16/2017
 * for leetCode problem:
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 */

public class RemoveLinkedListElements{
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) head = head.next;
        if(head == null) return null;

        ListNode walk = head;
        while(walk.next != null)
            if(walk.next.val == val) walk.next = walk.next.next;
            else walk = walk.next;
        
        return head;
    }
}