package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII{
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // 分析题目，抓住特性，子集产生子集
        
        ArrayList<List<Integer>> ret = new ArrayList();
        ret.add(new ArrayList<>());
        Arrays.sort(nums);

        int end = 0;// end idx of last adding
        int be = 0;
        for(int i=0; i<nums.length; i++){
            be = i>0 && nums[i]==nums[i-1] ? end : 0;
            end = ret.size();
            for(int j=be; j<end; j++){
                ArrayList newSubset = (ArrayList)(((ArrayList)ret.get(j)).clone());
                newSubset.add(nums[i]);
                ret.add(newSubset);
            }     
        }

        return ret;
    }
}
