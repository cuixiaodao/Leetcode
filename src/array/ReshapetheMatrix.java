package array;

/**
 * Created by cuixiaodao on 10/16/017
 * for leetCode problem:
 * https://leetcode.com/problems/reshape-the-matrix/description/
 */

public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int old_r = nums.length;
        int old_c = nums[0].length;

        int eleNum = old_r * old_c;
        if (eleNum != r * c)
            return nums;

        int[][] reshapedNums = new int[r][c];
        int cnt = 0;
        for (int i = 0; i < old_r; i++)
            for (int j = 0; j < old_c; j++) {
                reshapedNums[cnt / c][cnt % c] = nums[i][j];
                cnt++;
            }

        return reshapedNums;
    }
}
