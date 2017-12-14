package hashTable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by cuixiaodao on 11/15/2017
 * for leetCode problem:
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
 */

public class MinimumIndexSum {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> indexSum = new HashMap(list1.length + list2.length);

        for (int i = 0; i < list1.length; i++) indexSum.put(list1[i], i);

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0, minSum = 2000; i < list2.length; i++) {
            String key = list2[i];
            int s = indexSum.getOrDefault(key, 2000) + i;
            if (s < minSum) {
                minSum = s;
                ans.clear();
                ans.add(key);
            } else if (s == minSum)
                ans.add(key);
        }

        return ans.toArray(new String[0]);
    }
}