// https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
lass Solution {
    public int[] searchRange(int[] nums, int target) {
        int be = -1, end = -1;
        int idx = Arrays.binarySearch(nums, target);
        if (idx >= 0) {
            be = idx;
            while(be - 1 >= 0 && nums[be - 1] == target) {
                be--;
            }
            end = idx;
            while(end + 1 < nums.length && nums[end + 1] == target) {
                end++;
            }  
        }

        return new int[]{be, end};
    }
}
