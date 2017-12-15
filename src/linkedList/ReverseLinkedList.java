package linkedList;

/**
 * Created by cuixiaodao on 12/15/2017
 * for leetCode problem:
 * https://leetcode.com/problems/reverse-linked-list/description/
 */

public class ReverseLinkedList{
    public ListNode reverseList(ListNode head) {
        ListNode reverseHead = null;
        while(head != null){
            ListNode curNode = head;
            head = head.next;

            curNode.next = reverseHead;
            reverseHead = curNode;
        }

        return reverseHead;
    }

}