package Math;

import java.util.Arrays;
import java.util.List;

public class OptimalDivision{
    public String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        boolean paren = nums.length > 2;

        for(int i=0; i<nums.length; i++){
            sb.append(nums[i]);

            if(i != nums.length-1) sb.append('/');
            else if(paren) sb.append(')');

            if(paren && i==0) sb.append('(');
        }

        return sb.toString();
    }    
}