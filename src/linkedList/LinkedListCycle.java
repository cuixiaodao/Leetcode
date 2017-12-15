package linkedList;

/**
 * Created by cuixiaodao on 12/15/2017
 * for leetCode problem:
 * https://leetcode.com/problems/linked-list-cycle/description/
 */

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

//    public static void main(String[] args){
//        LinkedListCycle t = new LinkedListCycle()       ;
//        ListNode root = new ListNode(1);
//        root.next = new ListNode(2);
//        root.next.next = new ListNode(3);
//        root.next.next.next = new ListNode(4);
//        root.next.next.next.next = root.next.next;
//        System.out.print(t.hasCycle(root));
//    }

}