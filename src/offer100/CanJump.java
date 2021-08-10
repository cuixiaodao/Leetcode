package offer100;

class CanJump {
    int callCnt = 0;
    public boolean canJump(int[] nums) {
        // 吃透用例 -> 最佳思路 -> 更快
        int[] maxLen = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--) {
            maxLen[i] = getMaxJump(i, nums, maxLen);
        }
        System.out.println(callCnt);
        return maxLen[0] == nums.length - 1;
    }

    private int getMaxJump(int i, int[] nums, int[] maxLen) {
        // System.out.printf("i:%d, nums: %s, maxLen:%s\n", i, Arrays.toString(nums), Arrays.toString(maxLen));
        callCnt++;
        if (maxLen[i] != 0) {
            return maxLen[i];
        }

        if (i + nums[i] >= nums.length - 1) {
            return nums.length - 1;
        }
        if (nums[i] == 0) {
            return i;
        }

        int maxI = i + nums[i];
        int j = i + 1;
        while(j <= i + nums[i]) {
            maxLen[j] = getMaxJump(j, nums, maxLen);
            if (maxLen[j] < maxI) {
                j = maxLen[j] + 1;
            } else {
                maxI = maxLen[j];
                break;
            }
        }
        return maxI;
    }
}