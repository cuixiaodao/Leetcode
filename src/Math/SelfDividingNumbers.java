package Math;


import java.util.LinkedList;
import java.util.List;

public class SelfDividingNumbers{
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new LinkedList<>();
        while(left <= right){
            int res = left, dig = 1, n = 0;
            while(dig != 0 && (left % dig == 0)){
                dig = res % 10;
                res = res / 10;
                n++;
            }
            if(dig == 0 && res == 0){
                ans.add(left++);
            }
            else if(dig == 0) left = (int)(res*Math.pow(10, n) + (Math.pow(10, n)-1)/9);
            else left++;
        }
        return ans;
    }    
}