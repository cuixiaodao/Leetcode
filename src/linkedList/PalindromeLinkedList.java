package linkedList;

/**
 * Created by cuixiaodao on 12/15/2017
 * for leetCode problem:
 * https://leetcode.com/problems/palindrome-linked-list/description/
 */

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode walk = head;
        while (walk != null) {
            len++;
            walk = walk.next;
        }

        walk = head;
        int i = 0, mid = len / 2;
        while (i++ < mid) walk = walk.next;
        ListNode end = reverseList(walk);

        walk = head;
        i = 0;
        while (i++ < mid)
            if (walk.val == end.val) {
                walk = walk.next;
                end = end.next;
            } else return false;

        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode reverseHead = null;
        while (head != null) {
            ListNode curNode = head;
            head = head.next;

            curNode.next = reverseHead;
            reverseHead = curNode;
        }

        return reverseHead;
    }
}