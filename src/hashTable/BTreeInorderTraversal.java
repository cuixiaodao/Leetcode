package hashTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by cuixiaodao on 12/14/2017
 * for leetCode problem:
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 */

public class BTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        BTreeInorderTraversal t = new BTreeInorderTraversal();
        t.inorderTraversal(null);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> traversal = new ArrayList<>();

        if (root == null) return traversal;

        stack.push(root);
        while (stack.size() != 0) {
            TreeNode top = stack.peek();
            if (top.left != null) {
                stack.push(top.left);
                top.left = null;
            } else {
                traversal.add(top.val);
                stack.pop();
                if (top.right != null) stack.push(top.right);
            }
        }
        return traversal;
    }

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}


