package hashTable;

import java.util.HashSet;

/**
 * Created by cuixiaodao on 11/03/2017
 * for leetCode problem:
 * https://leetcode.com/problems/distribute-candies/description/
 */

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        int totalNum = candies.length;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i : candies) hashSet.add(i);
        int totalKind = hashSet.size();

        return Math.min(totalNum / 2, totalKind);
    }
}