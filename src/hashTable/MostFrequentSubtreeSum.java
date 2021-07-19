package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by cuixiaodao on 12/02/2017
 * for leetCode problem:
 * https://leetcode.com/problems/most-frequent-subtree-sum/description/
 */

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MostFrequentSubtreeSum {
    Map<Integer, Integer> sumCntMap = new HashMap<>();
    int maxSumCnt = -1;

    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) return new int[0];
        sumTree(root);
        List<Integer> ansList = new ArrayList<>();
        for (Entry<Integer, Integer> en : sumCntMap.entrySet())
            if (en.getValue() == maxSumCnt) ansList.add(en.getKey());

        int[] ans = new int[ansList.size()];
        int i = 0;
        for (int v : ansList) ans[i++] = v;

        return ans;
    }

    private int sumTree(TreeNode node) {
        int sum, leftSum, rightSum, sumCnt;
        leftSum = node.left != null ? sumTree(node.left) : 0;
        rightSum = node.right != null ? sumTree(node.right) : 0;
        sum = node.val + leftSum + rightSum;
        sumCnt = 1 + sumCntMap.getOrDefault(sum, 0);
        sumCntMap.put(sum, sumCnt);
        maxSumCnt = Math.max(maxSumCnt, sumCnt);

        return sum;
    }
}