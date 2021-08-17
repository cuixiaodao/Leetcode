/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderIdx = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            inorderIdx.put(inorder[i], i);
        }

        return buildTree(preorder, 0, preorder.length, inorderIdx, 0, inorder.length);
    }

    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, Map<Integer, Integer> inorderIdx, int inStart, int inEnd) {
        // System.out.printf("preStart: %d, preEnd: %d, inStart: %d, inEnd: %d\n", preStart, preEnd, inStart, inEnd);

        if (preStart >= preEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIdx = inorderIdx.get(root.val);
        int leftNum = rootIdx - inStart;
        int leftStart = preStart + 1;
        int leftEnd = leftStart  + leftNum;
        TreeNode left = buildTree(preorder, leftStart, leftEnd, inorderIdx, inStart, rootIdx);

        
        int rightStart = leftEnd;
        int rightEnd = preEnd;
        TreeNode right = buildTree(preorder, rightStart, rightEnd, inorderIdx, rootIdx + 1, inEnd);

        root.left = left;
        root.right = right;
        return root;
    }
} 
