package hashTable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by cuixiaodao on 11/03/2017
 * for leetCode problem:
 * https://leetcode.com/problems/keyboard-row/description/
 */

public class KeyboardRow{
    private HashMap<Character,Integer> keyRowMap = new HashMap<Character,Integer>();
    private void init(){
        for(char c : "qwertyuiop".toCharArray()) keyRowMap.put(c,1);
        for(char c : "asdfghjkl".toCharArray()) keyRowMap.put(c,2);
        for(char c : "zxcvbnm".toCharArray()) keyRowMap.put(c,3);
    }


    public String[] findWords(String[] words) {
        init();
        ArrayList<String> filteredWords = new ArrayList<String>();
        

        for(String w : words){
            char[] chars = w.toLowerCase().toCharArray();
            
            int r = keyRowMap.get(chars[0]);
            boolean sameRow = true;
            for(char c : chars)
                if(keyRowMap.get(c) != r){
                    sameRow = false;
                    break;
                }

            if(sameRow) filteredWords.add(w);
        }
        String[] ans = new String[filteredWords.size()];
        filteredWords.toArray(ans);
        return ans;
    }
}