package Math;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticSlices{
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length < 3) return 0;

        List<Integer> seqNums = new ArrayList<>();

        int curDiff = A[1]-A[0], curSeqN = 2;
        boolean isStillAri;
        for(int i=2; i<A.length; i++){
            isStillAri = A[i]-A[i-1] == curDiff;

            if(isStillAri) curSeqN++;

            if(curSeqN > 2 && (!isStillAri || i==A.length-1))
                seqNums.add(curSeqN);

            if(!isStillAri){
                curSeqN = 2;
                curDiff = A[i]-A[i-1];
            }
        }

        int arithN = 0;
        for(int n : seqNums) arithN += (n-1)*(n-2)/2;
        return arithN;
    }
}