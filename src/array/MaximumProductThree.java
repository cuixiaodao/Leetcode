package array;

import java.util.Arrays;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/maximum-product-of-three-numbers/description/
 */

public class MaximumProductThree {
    /**
     * find maximum product of three numbers in nums
     *
     * @param nums, an array
     * @return the maximum product
     */
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int last = nums.length - 1;
        return Math.max(nums[0] * nums[1] * nums[last],
                nums[last] * nums[last - 1] * nums[last - 2]);
    }
}