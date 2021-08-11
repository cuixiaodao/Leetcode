class Solution {
    public void sortColors(int[] nums) {
        int zeroIdx = moveFirst(0, 0, nums);
        System.out.println(Arrays.toString(nums));
        int oneIdx = moveFirst(1, zeroIdx, nums);
        System.out.println(Arrays.toString(nums));
    }

    private int moveFirst(int target, int be, int[] nums) {
        int end = nums.length - 1;
        while(be < end) {
            while(nums[be] == target && be < end) {
                be++;
            }
            while(nums[end] != target && be < end) {
                end--;
            }
            
            if (be < end) {
                nums[end] = nums[be];
                nums[be] = target;
            }


            // System.out.printf("be: %d, end: %d, res: %s\n", be, end, Arrays.toString(nums));
        }
        return be;    
    }
}
