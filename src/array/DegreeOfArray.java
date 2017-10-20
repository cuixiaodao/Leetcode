package array;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/degree-of-an-array/description/
 */


public class DegreeOfArray {

    public int findShortestSubArray(int[] nums) {
        int maxNum = 0;
        for (int i : nums)
            maxNum = Math.max(i, maxNum);

        // numCnt: frequency, first appear position, last appear position
        int[][] numCnt = new int[maxNum + 1][3];
        int elem;
        for (int i = 0; i < nums.length; i++) {
            elem = nums[i];
            if (numCnt[elem][0] == 0)
                numCnt[elem][1] = i;

            numCnt[elem][2] = i;
            numCnt[elem][0] += 1;
        }

        int curMaxFre = 0;
        int curMinLen = nums.length;
        int recLen;

        for (int[] rec : numCnt) {
            recLen = rec[2] - rec[1] + 1;
            if (curMaxFre < rec[0]) {
                curMaxFre = rec[0];
                curMinLen = recLen;
            } else if (curMaxFre == rec[0]) {
                curMinLen = Math.min(curMinLen, recLen);
            }
        }

        return curMinLen;
    }
}