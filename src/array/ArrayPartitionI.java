package array;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/array-partition-i/description/
 */

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        this.mergeSort(nums, 0, nums.length - 1);

        int s = 0;
        for (int i = 0; i < nums.length; i += 2) {
            s += nums[i];
        }
        return s;
    }

    // increasing order
    private void mergeSort(int[] arr, int start, int end) {
        if (start == end)
            return;

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        // merge two sorted subarray
        int arrLen = end - start + 1;
        int[] arrTmp = new int[arrLen];

        int left = start;
        int right = mid + 1;
        int n = 0; //index of final sorted arr
        while (left <= mid && right <= end) {
            if (arr[left] < arr[right])
                arrTmp[n++] = arr[left++];
            else
                arrTmp[n++] = arr[right++];
        }

        while (left <= mid)
            arrTmp[n++] = arr[left++];

        while (right <= end)
            arrTmp[n++] = arr[right++];

        // copy result to original arr
        n = 0;
        while (n < arrLen)
            arr[start + n] = arrTmp[n++];
    }
}