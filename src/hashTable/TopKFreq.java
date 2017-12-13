package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * Created by cuixiaodao on 12/13/2017
 * for leetCode problem:
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 */

 public class TopKFreq{
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> eleCntMap = new HashMap<>(nums.length*3/2); // ele: cnt
        for(int i : nums)
            eleCntMap.put(i, 1+eleCntMap.getOrDefault(i, 0));

        // i: cnt of elements in eleCntMap[i]
        HashMap<Integer,List<Integer>> cntElesMap = new HashMap<>(nums.length); //cnt : eles
        for(Entry<Integer,Integer> en : eleCntMap.entrySet()){
            int ele = en.getKey(), cnt = en.getValue();

            if(cntElesMap.get(cnt) == null) cntElesMap.put(cnt, new ArrayList<Integer>());
            cntElesMap.get(cnt).add(ele);
        }

        // find k most freq elements
        List<Integer> kMostFreq = new ArrayList<>();
        int maxFreq = nums.length; // max possible freqency of next element;
        for(int i=nums.length; i>0 && kMostFreq.size()<k; i--){
            List<Integer> arrI = cntElesMap.get(i);
            if(arrI != null){
                kMostFreq.addAll(arrI);
                maxFreq -= i * arrI.size();
            }
        }

        return kMostFreq.subList(0,k);
    }
 }