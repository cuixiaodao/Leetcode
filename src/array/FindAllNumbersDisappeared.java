package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */

public class FindAllNumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0 && nums[i] != i + 1) {
                tmp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                if (tmp == nums[i])
                    nums[i] = 0;
                else
                    nums[i] = tmp;
            }
        }

        List<Integer> disappeared = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                disappeared.add(i + 1);
        }

        return disappeared;
    }
}