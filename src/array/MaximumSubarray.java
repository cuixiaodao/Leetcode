package array;

/**
 * Created by cuixiaodao on 10/24/2017
 * for leetCode problem:
 * https://leetcode.com/problems/maximum-subarray/description/
 */

public class MaximumSubarray{
    public int maxSubArray(int[] nums) {
        int sumMax = Integer.MIN_VALUE, sum = 0, start = 0;

        for(int i=0; i<nums.length; i++){

            if(sum < 0){
                sum = nums[i];
            } else sum += nums[i];

            if(sumMax < sum) sumMax = sum;
        }

        return sumMax;
    }

}