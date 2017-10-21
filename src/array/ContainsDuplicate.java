package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/contains-duplicate/description/
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for (int n : nums)
            if (!s.add(n)) return true;

        return false;
    }
}