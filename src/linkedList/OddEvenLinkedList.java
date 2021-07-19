package linkedList;

/**
 * Created by cuixiaodao on 12/19/2017
 * for leetCode problem:
 * https://leetcode.com/problems/odd-even-linked-list/description/
 */

public class OddEvenLinkedList{
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode odd = head, even = head.next;
        ListNode walk_o = odd, walk_e = even;
        while(walk_e != null && walk_e.next != null) {
            walk_o.next = walk_e.next;
            walk_o = walk_o.next;
            walk_e.next = walk_o.next;
            walk_e = walk_e.next;
        }       
        walk_o.next = even;
        return odd;
    }     
}