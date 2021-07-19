package hashTable;

/**
 * Created by cuixiaodao on 11/03/2017
 * for leetCode problem:
 * https://leetcode.com/problems/keyboard-row/description/
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int n : nums)
            single ^= n;
        return single;
    }
}