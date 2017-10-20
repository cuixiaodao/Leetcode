package array;

import java.util.HashMap;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/degree-of-an-array/description/
 */

public class MajorityElement{
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> cntMap = new HashMap<Integer, Integer>();
        for (int i : nums) {
            cntMap.put(i, cntMap.getOrDefault(i, 0) + 1);
            if (cntMap.get(i) > nums.length / 2) return i;
        }
        return 0;
    }
}