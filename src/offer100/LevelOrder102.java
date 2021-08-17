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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        List<TreeNode> curlevel = new LinkedList<>();
        List<TreeNode> nextLevel;
        curlevel.add(root);
        while(curlevel.size() > 0) {
            nextLevel = new LinkedList<>();
            List<Integer> levelValues = new LinkedList<>();
            for (TreeNode node : curlevel) {                
                if (node == null) {
                    continue;
                }
                levelValues.add(node.val);
                nextLevel.add(node.left);
                nextLevel.add(node.right);
            }
            curlevel = nextLevel;
            if (levelValues.size() > 0) {
                res.add(levelValues);
            }            
        }
        return res;
    }
}

