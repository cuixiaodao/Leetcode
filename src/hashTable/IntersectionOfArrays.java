package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cuixiaodao on 11/04/2017
 * for leetCode problem:
 * https://leetcode.com/problems/island-perimeter/description/
 */

public class IntersectionOfArrays{
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> intersect = new HashSet<Integer>();

        for(int i : nums1)
            set1.add(i);

        for(int i : nums2)
            if(set1.contains(i)) intersect.add(i);

        int[] ans = new int[intersect.size()];

        int i = 0;
        for(int x : intersect) ans[i++] = x;

        return ans;
    }    
}