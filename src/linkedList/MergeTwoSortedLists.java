package linkedList;

/**
 * Created by cuixiaodao on 12/15/2017
 * for leetCode problem:
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode walk1 = l1, walk2 = l2, root, cur;

        // init root node
        if (walk1.val < walk2.val) {
            root = l1;
            walk1 = walk1.next;
        } else {
            root = l2;
            walk2 = walk2.next;
        }
        cur = root;


        while (walk1 != null && walk2 != null) {
            if (walk1.val < walk2.val) {
                cur.next = walk1;
                walk1 = walk1.next;
            } else {
                cur.next = walk2;
                walk2 = walk2.next;
            }
            cur = cur.next;
        }

        if (walk1 == null) cur.next = walk2;
        else cur.next = walk1;

        return root;
    }
}