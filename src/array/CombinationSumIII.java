package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuixiaodao on 11/2/017
 * for leetCode problem:
 * https://leetcode.com/problems/combination-sum-iii/description/
 */

public class CombinationSumIII{
    List<List<Integer>> combinations;
    int k;
    public List<List<Integer>> combinationSum3(int k, int n) {
        combinations = new ArrayList<List<Integer>>();
        this.k = k;
        for(int i=1; i<=9; i++){
            if(i<=n) combinationSum3(i, new ArrayList<Integer>(), n);
        }
        return combinations;
    }

    private void combinationSum3(int s, List<Integer> path, int n){
        path.add(s);
        n = n-s;
        if(path.size() == k){
            if(n == 0) combinations.add(path);
        }
        else{
            for(int i=s+1; i<=9; i++){
                if(i<=n) combinationSum3(i, new ArrayList<Integer>(path), n);
            }
        }
    }
}