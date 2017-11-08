package hashTable;

/**
 * Created by cuixiaodao on 11/04/2017
 * for leetCode problem:
 * https://leetcode.com/problems/island-perimeter/description/
 */

public class FindDifference{
public char findTheDifference(String s, String t) {
    char xor = 0;
    for(char c : (s+t).toCharArray()) xor ^= c;            
    return xor;
}
}