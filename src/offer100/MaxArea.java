class Solution {
    public int maxArea(int[] height) {
        // https://leetcode-cn.com/problems/container-with-most-water/
        // 最大 -> 更大怎么找
        int maxWater = 0;
        int curWater;
        int curHeight;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            curHeight = Math.min(height[i], height[j]);
            curWater = curHeight * (j - i);
            // System.out.printf("i: %d, j: %d \n", i, j);
            if (curWater > maxWater) {
                maxWater = curWater;
            }

            while (i < j && height[i] <= curHeight) {
                i++;
            }
            while (i < j && height[j] <= curHeight ) {
                j--;
            }
        }

        return maxWater;
    }
}
