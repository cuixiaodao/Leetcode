package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII{
    int[] cand;
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList();
        cand = candidates;
        Arrays.sort(cand);

        findSubsets(new ArrayList<Integer>(), 0, target);
        return ans;
    }

    // find subsets contains cand[be~end], and sums to target
    private void findSubsets(ArrayList<Integer> ret, int be, int target){
        if(target == 0) {
            ans.add((ArrayList)ret.clone());
            return;
        }

        for(int i=be; i<cand.length && cand[i]<=target; i++){
            if(i>be && cand[i]==cand[i-1]) continue;
            ret.add(cand[i]);
            findSubsets(ret, i+1, target-cand[i]);
            ret.remove(ret.size()-1);
        }            
        return;
    }
}