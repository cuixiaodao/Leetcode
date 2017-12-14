package hashTable;

/**
 * Created by cuixiaodao on 11/15/2017
 * for leetCode problem:
 * https://leetcode.com/problems/longest-palindrome/description/
 */

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Boolean[] charTable = new Boolean[58];
        for (int i = 0; i < charTable.length; i++) charTable[i] = false;

        int pairCnt = 0;
        for (int c : s.toCharArray()) {
            int i = c - 65;
            // charTable[i]==True when c appears even times
            if (charTable[i]) pairCnt++;
            charTable[i] = !charTable[i];
        }

        pairCnt = 2 * pairCnt;
        return pairCnt + (pairCnt == s.length() ? 0 : 1);
    }
}