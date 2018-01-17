package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations{
    List<List<Integer>> ret;
    public List<List<Integer>> permute(int[] nums) {
        ret = new ArrayList<List<Integer>>();
        permute(nums, 0);
        return ret;
    }

    // give nums, add all permutation nums from idx
    private void permute(int[] nums, int idx){
        if(idx == nums.length){
            ret.add(intArrToList(nums));
            return;
        }
        for(int i=idx; i<nums.length; i++){
            swap(nums, idx, i);
            permute(nums, idx+1);
            swap(nums, i, idx);
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private List<Integer> intArrToList(int[] nums){
        List<Integer> ln = new ArrayList(nums.length);
        for(int i : nums) ln.add(i);
        return ln;
    }
}