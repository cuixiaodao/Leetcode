package linkedList;

/**
 * Created by cuixiaodao on 12/19/2017
 * for leetCode problem:
 * https://leetcode.com/problems/swap-nodes-in-pairs/description/
 */

public class SwapNodesPairs{
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode second = head.next;

        head.next = swapPairs(second.next);
        second.next = head;
        return second;
    }
}