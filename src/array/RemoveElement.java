package array;

/**
 * Created by cuixiaodao on 10/25/017
 * for leetCode problem:
 * https://leetcode.com/problems/remove-element/description/
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int n : nums)
            if (n != val) nums[i++] = n;

        return i;
    }
}