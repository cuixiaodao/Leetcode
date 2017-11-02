package array;

/**
 * Created by cuixiaodao on 11/2/017
 * for leetCode problem:
 * https://leetcode.com/problems/combination-sum-iii/description/
 */
public class FindDuplicate{
    public int findDuplicate(int[] nums) {
        if(nums.length < 2) return -1;

        int fast = nums[nums[0]], slow = nums[0];
        while(fast != slow){
            fast=nums[nums[fast]];
            slow=nums[slow];
        }

        slow = 0;
        while(fast != slow){
            fast=nums[fast];
            slow=nums[slow];
        }

        return fast;
    }
}