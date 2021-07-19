package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum{
    List<List<Integer>> ans;
    int[] cand;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<List<Integer>>();;
        cand = candidates;

        combinationSum(cand.length-1, target, new ArrayList<Integer>());
        return ans;
    }

    /**get all combinations of cand[i], i belong [0,e)
     * that with sum equals @s
     */
    private void combinationSum(int e, int s, ArrayList<Integer> ret){
        if(s <= 0){
            if(s ==0) ans.add(ret);
            return;
        }

        for(int i=0; i<=e; i++){
            ArrayList newRet = (ArrayList)ret.clone();
            newRet.add(cand[i]);
            combinationSum(i, s-cand[i], newRet);
        }
        return;
    }
}