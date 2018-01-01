package Math;

import java.util.Arrays;

public class MinMoves2{
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int medIdx = (nums.length-1)/2;
        int med = nums[medIdx];
        int minMoves = nums.length%2 == 0 ? -med : 0;
        for(int i=0; i<medIdx; i++) minMoves += -nums[i];
        for(int i=medIdx+1; i<nums.length; i++) minMoves += nums[i];
        return minMoves;
    }    
}