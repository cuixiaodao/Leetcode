package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuixiaodao on 12/14/2017
 * for leetCode problem:
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 */

public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> ABMap = new HashMap<>();
        for (int i : A)
            for (int j : B) {
                int s = i + j;
                ABMap.put(s, ABMap.getOrDefault(s, 0) + 1);
            }

        int total = 0;
        for (int i : C)
            for (int j : D) {
                total += ABMap.getOrDefault(-i - j, 0);
            }
        return total;
    }
}