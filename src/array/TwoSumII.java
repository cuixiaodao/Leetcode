package array;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int idx2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            idx2 = binarySearch(numbers, target - numbers[i], i+1, numbers.length - 1);
            if (idx2 > 0) return new int[]{i + 1, idx2 + 1};
        }
        return null;
    }

    private int binarySearch(int[] numbers, int x, int start, int end) {
        if (start > end) return -1;

        int middle = (start + end) / 2;
        if (x < numbers[middle])
            return binarySearch(numbers, x, start, middle - 1);
        else if (x == numbers[middle])
            return middle;
        else return binarySearch(numbers, x, middle + 1, end);
    }
}