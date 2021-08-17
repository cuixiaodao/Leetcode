// 128
class Solution {
    public int longestConsecutive(int[] nums) {
        // 注意其复杂度计算
        // 让存在的数好判断 -> 判断预期的数是否存在
        Set<Integer> numSet = new HashSet<>();
        for (int n : nums) {
            numSet.add(n);
        }
        int maxLen = 0;
        int curLen;
        for (int n : numSet) {
            if (numSet.contains(n - 1)) {
                continue;
            }
            curLen = 1;
            while(numSet.contains(++n)) {
                curLen++;
            }
            if (curLen > maxLen) {
                maxLen = curLen;
            }
        }
        return maxLen;
    }
}
