package hashTable;

/**
 * Created by cuixiaodao on 11/03/2017
 * for leetCode problem:
 * https://leetcode.com/problems/set-mismatch/description/
 */
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        for (int i : nums)
            if (nums[Math.abs(i) - 1] < 0) ans[0] = Math.abs(i);
            else nums[Math.abs(i) - 1] *= -1;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0) ans[1] = i + 1;

        return ans;
    }
}