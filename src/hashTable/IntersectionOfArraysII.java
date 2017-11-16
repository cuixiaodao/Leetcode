package hashTable;

import java.util.*;

/**
 * Created by cuixiaodao on 11/16/2017
 * for leetCode problem:
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 */

public class IntersectionOfArraysII{
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap();
        ArrayList<Integer> intersect = new ArrayList();

        for(int i : nums1)
            map1.put(i, map1.getOrDefault(i, 0)+1);

        for(int i : nums2){
            
            if(map1.containsKey(i)){
                intersect.add(i);
                int keyCnt = map1.get(i);
                if(keyCnt == 1) map1.remove(i);
                else map1.put(i, keyCnt-1);
            } 
        }


        int[] ans = new int[intersect.size()];

        int i = 0;
        for(int x : intersect) ans[i++] = x;

        return ans;
    }
}