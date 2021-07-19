package array;

/**
 * Created by cuixiaodao on 10/17/017
 * for leetCode problem:
 * https://leetcode.com/problems/max-consecutive-ones/description/
 */

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curMax = 0;
        int curCnt = 0;

        int i = 0;
        while (i < nums.length)
            if (nums[i++] == 1) curCnt++;
            else {
                curMax = Math.max(curCnt, curMax);
                curCnt = 0;
            }

        // if nums ends with ones, the last curCnt will 
        // not be compared with curMax
        return Math.max(curCnt, curMax);
    }
}