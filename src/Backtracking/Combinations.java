package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations{
    List<List<Integer>> ans;
    int N;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<List<Integer>>();
        N = n;

        if(n<1 || k<1) return ans;

        combine(k, 1, new ArrayList<Integer>());
        return ans;
    }

    /** from @b‚ to @n, 
     * chooose k number, get total combinations
     */
    private void combine(int k, int b, ArrayList<Integer> ret){
        if(k == 0){
            ans.add(ret);
            return;
        }

        for(int i=b; i<=N+1-k; i++){
            ArrayList newArr = (ArrayList)ret.clone();
            newArr.add(i);
            combine(k-1, i+1, newArr);
        }
    }
}