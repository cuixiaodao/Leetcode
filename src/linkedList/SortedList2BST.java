package linkedList;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * Created by cuixiaodao on 12/20/2017
 * for leetCode problem:
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/
 */


public class SortedList2BST{
    class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }    
    public TreeNode sortedListToBST(ListNode head) {        
        ListNode walk = head;
        int lenTotal = 0;
        while(walk != null){
            walk = walk.next;
            lenTotal++;
        }

        return sortedListToBST(head, lenTotal);
    }

    private TreeNode sortedListToBST(ListNode head, int len) {
        if(head == null) return null;
        else if(head.next == null) return new TreeNode(head.val);

        int lenL = 1;
        ListNode walk = head;
        while(lenL < len/2){
            walk = walk.next;
            lenL++;
        }
        ListNode mid = walk.next;
        walk.next = null;

        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head, lenL);
        root.right = sortedListToBST(mid.next, len-lenL-1);
        return root;
    }

   public static void main(String[] args){
       SortedList2BST t = new SortedList2BST();
       ListNode root = new ListNode(-10);
       root.next = new ListNode(-3);
       root.next.next = new ListNode(0);
       root.next.next.next = new ListNode(5);
       root.next.next.next.next = new ListNode(9);
       TreeNode ans = t.sortedListToBST(root);
       System.out.print(ans);
   }    
}