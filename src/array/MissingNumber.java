package array;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/missing-number/description/
 */

 public class MissingNumber{
    public int missingNumber(int[] nums) {
        int missing = 0;

        for(int i=0; i<nums.length; i++){
            missing += i - nums[i];
        }

        return missing+nums.length;
    }
 }