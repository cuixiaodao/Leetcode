// 139
// 超时 -> 必须迭代 -> 使用动态规划优化
class Solution {
    // is last i char breakable
    boolean[] unbreakArr;
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.equals("")) {
            return true;
        }

        if (null == unbreakArr) {
            unbreakArr = new boolean[s.length()];
        }
        if (unbreakArr[s.length() - 1]) {
            return false;
        }

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                if (wordBreak(s.substring(word.length()), wordDict)) {
                    return true;
                }
            }
        }
        unbreakArr[s.length() - 1] = true;
        // System.out.println(Arrays.toString(unbreakArr));
        return false;
    }
}
