package linkedList;

/**
 * Created by cuixiaodao on 12/18/2017
 * for leetCode problem:
 * https://leetcode-cn.com/problems/add-two-numbers/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur;
        ListNode pre = null;

        int cin = 0;
        int a, b, s;
        while(null != l1 || null != l2 || cin > 0) {
            a = null == l1 ? 0 : l1.val;
            b = null == l2 ? 0 : l2.val;

            s = a + b + cin;
            if (s < 10) {
                cin = 0;
            } else {
                s = s - 10;
                cin = 1;
            }

            cur = new ListNode(s);
            if (pre != null) {
                pre.next = cur;
            } else{
                head = cur;
            }
            pre = cur;

            if (null != l1) {
                l1 = l1.next;
            }
            if (null != l2) {
                l2 = l2.next;
            }
        }

        return head;
    }
}