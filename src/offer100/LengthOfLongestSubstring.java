package offer100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LengthOfLongestSubstring {
    int maxLen = 0;

    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        Map<Character, List<Integer>> idxMap = new HashMap<>();
        List<Integer> idxList;
        for (int i = 0; i < arr.length; i++) {
            idxList = idxMap.get(arr[i]);
            if (null == idxList) {
                idxList = new ArrayList<Integer>();
                idxMap.put(arr[i], idxList);
            }
            idxList.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            findMaxLen(arr, 0, idxMap);
        }
        return maxLen;
    }

    private void findMaxLen(char[] arr, int be, Map<Character, List<Integer>> idxMap) {
        int end = arr.length;
        for (int i = be; i < end || end - be < maxLen; i++) {
            end = Math.min(end, findNextIdx(be, idxMap.get(arr[i])));
        }

        if (end - be > maxLen) {
            maxLen = end - be;
        }

    }

    private int findNextIdx(int cur, List<Integer> idxList) {
        // todo binary search
        for(int i = 0; i < idxList.size(); i++) {
            if (idxList.get(i) == cur) {
                if (i + 1 < idxList.size()) {
                    return idxList.get(i + 1);
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}