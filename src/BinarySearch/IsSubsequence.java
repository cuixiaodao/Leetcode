package BinarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IsSubsequence{
    public boolean isSubsequence(String s, String t) {
        Map<Character, ArrayList<Integer>> alphaPos = new HashMap();
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(alphaPos.get(c) == null)
                alphaPos.put(c, new ArrayList<Integer>());
            alphaPos.get(c).add(i);
        }

        int curCharIdx = -1;
        for(char c : s.toCharArray()){
            ArrayList<Integer> arr = alphaPos.get(c);
            if(arr == null || arr.get(arr.size()-1) <= curCharIdx) return false;
            else
                curCharIdx = binarySearch(arr, curCharIdx, 0, arr.size()-1);
        }
        return true;        
    }
    
    // find min num big than t
    private int binarySearch(ArrayList<Integer> arr, int t, int be, int en){
        if(arr.get(be) > t) return arr.get(be);

        int med = (be+en) / 2;
        if(arr.get(med) <= t)
            return binarySearch(arr, t, med+1, en);
        else
            return binarySearch(arr, t, be, med);        
    }
}