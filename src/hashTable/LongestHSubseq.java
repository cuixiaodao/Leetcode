package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuixiaodao on 11/18/2017
 * for leetCode problem:
 * https://leetcode.com/problems/longest-harmonious-subsequence/description/
 */

public class LongestHSubseq {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> numCntMap = new HashMap<Integer, Integer>();
        for (int n : nums)
            numCntMap.put(n, 1 + numCntMap.getOrDefault(n, 0));

        int maxLen = 0;
        for (int key : numCntMap.keySet())
            if (numCntMap.containsKey(key + 1))
                maxLen = Math.max(numCntMap.get(key) + numCntMap.get(key + 1),
                        maxLen);
        return maxLen;
    }
}
