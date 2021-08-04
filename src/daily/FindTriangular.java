package daily;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/valid-triangle-number/
 */
public class FindTriangular {
    public int triangleNumber(int[] nums) {
        int total = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // 可使用三角不等式进一步减少搜索，暴力 -> 查找
                for (int k = j + 1; k < nums.length; k++) {
                    if (isTriangular(nums[i], nums[j], nums[k])) {
                        total++;
                    } else {
                        break;
                    }
                }
            }
        }
        return total;
    }

    private boolean isTriangular(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
