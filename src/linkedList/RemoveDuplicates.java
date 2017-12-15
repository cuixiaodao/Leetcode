package linkedList;

/**
 * Created by cuixiaodao on 12/15/2017
 * for leetCode problem:
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 */

public class RemoveDuplicates{
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        
        ListNode cur = head;
        while(cur.next != null)
            if(cur.val == cur.next.val)
                cur.next = cur.next.next;
            else cur = cur.next;
        return head;
    }
}


class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}