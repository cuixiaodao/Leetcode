// https://leetcode-cn.com/problems/unique-binary-search-trees/submissions/
class Solution {
    public int numTrees(int n) {
        int[] numTree = new int[n];
        return getNumTrees(numTree, n);
    }

    private int getNumTrees(int[] numTree, int n) {
        if (n <= 1) {
            return 1;
        }
        if (numTree[n-1] > 0) {
            return numTree[n-1];
        }

        int total = 0;
        for(int i = 1; i <= n; i++) {
            total += getNumTrees(numTree, i - 1) * getNumTrees(numTree, n - i);
        }
        numTree[n-1] = total;
        return total;
    }
}
