package array;

/**
 * Created by cuixiaodao on 10/24/2017
 * for leetCode problem:
 * https://leetcode.com/problems/search-insert-position/description/
 */

public class SearchInsertPosition{
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }

    private int binarySearch(int[] numbers, int x, int start, int end) {
        if (start > end) return start;

        int middle = (start + end) / 2;
        if (x < numbers[middle])
            return binarySearch(numbers, x, start, middle - 1);
        else if (x == numbers[middle])
            return middle;
        else return binarySearch(numbers, x, middle + 1, end);
    }
}