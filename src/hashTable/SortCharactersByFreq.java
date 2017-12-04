package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by cuixiaodao on 12/04/2017
 * for leetCode problem:
 * https://leetcode.com/problems/sort-characters-by-frequency/description/
 */
public class SortCharactersByFreq {
    public String frequencySort(String s) {
        Map<Character, Integer> charCnt = new HashMap<>();
        for (char c : s.toCharArray())
            charCnt.put(c, 1 + charCnt.getOrDefault(c, 0));

        List<Character>[] charBucket = new List[s.length() + 1];
        for (Entry<Character, Integer> en : charCnt.entrySet()) {
            int cnt = en.getValue();
            if (charBucket[cnt] == null)
                charBucket[cnt] = new ArrayList<>();
            charBucket[cnt].add(en.getKey());
        }

        char[] charStr = new char[s.length()];
        int curIdx = 0;
        for (int cnt = s.length(); cnt > 0; cnt--) {
            List<Character> charSort = charBucket[cnt];
            if (charSort != null)
                for (char c : charSort)
                    for (int j = 0; j < cnt; j++)
                        charStr[curIdx++] = c;
        }

        return String.valueOf(charStr);
    }
}