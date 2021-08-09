package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer idx = map.get(target - nums[i]);
            if (null != idx && idx != i) {
                return new int[] {i, idx};
            }
        }
        return new int[] {-1, -1};
    }
}
