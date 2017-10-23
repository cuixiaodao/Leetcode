package array;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
 */

public class LongestIncreSubseq {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;

        int maxIncN = 1, curIncN = 1;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] > nums[i - 1]) curIncN += 1;
            else {
                maxIncN = Math.max(maxIncN, curIncN);
                curIncN = 1;
            }

        return Math.max(maxIncN, curIncN);
    }
}