package Backtracking;

import java.util.LinkedList;

public class BeautifulArrangement {
    int arrCnt = 0;
    public int countArrangement(int N) {
        boolean[] visted = new boolean[N];
        countArrangement(1, visted);
        return arrCnt;
    }

    private void countArrangement(int idx, boolean[] visted){
        
        if(idx > visted.length){
            arrCnt++;
            return;
        }

        for(int i = 0; i < visted.length; i++) {
            int n = i + 1;
            if (!visted[i] && (n%idx == 0 || idx%n == 0)) {
                visted[i] = true;
                countArrangement(idx+1, visted);
                visted[i] = false;
            }
        }
        return;
    }
}
