package hashTable;

import java.util.HashMap;
import java.util.Map;

public class LongestWord {
    // v indicates whether k can be built one character at a time
    private Map<String, Boolean> wordDicts = new HashMap();

    public String longestWord(String[] words) {
        String curMaxStr = "";
        for (String w : words) wordDicts.put(w, false);
        for (String w : words)
            if (canBuiltByChars(w))
                if (w.length() > curMaxStr.length() ||
                        (w.length() == curMaxStr.length() && curMaxStr.compareTo(w) > 0))
                    curMaxStr = w;
        return curMaxStr;
    }

    private Boolean canBuiltByChars(String w) {
        int wLen = w.length();
        if (wLen <= 1) return true;

        String wSub = w.substring(0, wLen - 1);
        if (!wordDicts.containsKey(wSub)) return false;

        if (wordDicts.get(wSub) || canBuiltByChars(wSub))
            return true;

        wordDicts.remove(wSub);
        return false;
    }
}