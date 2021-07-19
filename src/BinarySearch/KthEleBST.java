package BinarySearch;

public class KthEleBST{
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int order, ans;
    public int kthSmallest(TreeNode root, int k) {
        order = k;
        inorderTraversal(root);
        return ans;
    }

    private void inorderTraversal(TreeNode root){
        if(root == null) return;

        inorderTraversal(root.left);

        if(--order == 0){
            ans = root.val;
            return;
        }

        inorderTraversal(root.right);
    }
}