package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GrayCode{
    List<Integer> ret;

    public List<Integer> grayCode(int n) {
        if(n == 0) {
            List<Integer> ret = new ArrayList<>();
            ret.add(0);
            return ret;
        }

        ret = grayCode(n - 1);
        // pow(2, n） 用移位替代
        int seqN = 1 << (n - 1);
        for(int i=seqN; i>0; i--)
            ret.add(seqN + ret.get(i-1));
        return ret;
    }
}
