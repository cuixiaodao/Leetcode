package array;

/**
 * Created by cuixiaodao on 10/19/017
 * for leetCode problem:
 * https://leetcode.com/problems/move-zeroes/description/
 */

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = -1;
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[++j] = nums[i];
                if (i != j) nums[i] = 0;
            }
            i++;
        }
    }
}