class Solution {
    public void nextPermutation(int[] nums) {
        // find change idxOri, idxReplace,
        // nums are increasing from nums[N-1] to nums[idxOri];
        // nums[idxOri] is a litter lower than nums[idxReplace], and make nums[idxOri:] increasing (reverse)
        // swap and then get bigger
        if (nums.length < 2) {
            return;
        }
        int idxOri = nums.length - 2;
        while(idxOri >= 0 && nums[idxOri] >= nums[idxOri + 1]) {
            idxOri--;
        }


        if (idxOri >= 0) {
            int idxReplace = nums.length - 1;
            while(nums[idxReplace] <= nums[idxOri]) {
                idxReplace--;
            }
        
            System.out.printf("idxOri:%d, idxReplace: %d \n", idxOri, idxReplace);            
            swap(idxOri, idxReplace, nums);            
        }
        System.out.println(Arrays.toString(nums));

        reverse(idxOri + 1, nums.length - 1, nums);
    }

    private void reverse(int be, int end, int[] nums) {
        do {
            swap(be, end, nums);
        } while(++be < --end);
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
