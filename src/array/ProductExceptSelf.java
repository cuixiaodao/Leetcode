package array;

/**
 * Created by cuixiaodao on 10/30/017
 * for leetCode problem:
 * https://leetcode.com/problems/product-of-array-except-self/description/
 */

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];

        out[out.length - 1] = 1;
        // set out[i] be the product of nums[j], j>i
        for (int i = nums.length - 2; i >= 0; i--)
            out[i] = out[i + 1] * nums[i + 1];

        int proLeft = 1;
        for (int i = 0; i < nums.length; i++) {
            out[i] = proLeft * out[i];
            proLeft *= nums[i];
        }

        return out;
    }
}