package array;

/**
 * Created by cuixiaodao on 10/30/017
 * for leetCode problem:
 * https://leetcode.com/problems/beautiful-arrangement-ii/description/
 */

public class BeautifulArrangementII{
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        for(int i=0; i<=(k-1)/2; i++){
            ans[2*i] = i+1;
            ans[2*i+1] = k+1-i;
        }

        if(k%2 == 0) ans[k] = k/2+1;
        
        for(int i=k+1; i<n; i++) ans[i] = i+1;
        return ans;
    }    
}