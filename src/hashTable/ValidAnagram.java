package hashTable;

import java.util.HashMap;

/**
 * Created by cuixiaodao on 11/10/2017
 * for leetCode problem:
 * https://leetcode.com/problems/island-perimeter/description/
 */

public  class ValidAnagram{
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();

        for(char c : s.toCharArray())
            sMap.put(c, sMap.getOrDefault(c,0)+1);

        int charCnt;
        for(char c : t.toCharArray())
            if(!sMap.containsKey(c)) return false;
            else{
                charCnt = sMap.get(c)-1;
                if(charCnt < 0) return false;
                sMap.put(c, charCnt);
            }

        return true;
    }
}