package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuixiaodao on 10/25/017
 * for leetCode problem:
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 */

public class FindDuplicates{
    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int n : nums)
            nums[(n-1)%len] += len;
        
        for(int i=0; i<nums.length; i++)
            if((nums[i]-1)/len == 2) ans.add(i+1);
        
        return ans;
    }    
}