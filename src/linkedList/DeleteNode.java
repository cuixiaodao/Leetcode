package linkedList;

/**
 * Created by cuixiaodao on 12/15/2017
 * for leetCode problem:
 * https://leetcode.com/problems/delete-node-in-a-linked-list/description/
 */

public class DeleteNode{

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

//    public static void main(String[] args){
//        ListNode root = new ListNode(1);
//        root.next = new ListNode(2);
//        root.next.next = new ListNode(3);
//        root.next.next.next = new ListNode(4);
//        deleteNode(root.next.next);
//    }
}

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}