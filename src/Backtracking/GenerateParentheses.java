package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses{
    List<String> ret = new LinkedList<String>();
    public List<String> generateParenthesis(int n) {
        char[] parenArr = new char[2*n];
        genParen(parenArr, 0, 0, n);
        return ret;
    }

    private void genParen(char[] chArr, int l_cnt, int r_cnt, int N){
        int idx = l_cnt+r_cnt;
        if(l_cnt == N){
            while (idx < 2*N) chArr[idx++] = ')';
            ret.add(new String(chArr));
            return;
        }

        chArr[idx] = '(';
        genParen(chArr, l_cnt+1, r_cnt, N);
        // only try add ")" when l_cnt > r_cnt
        if(l_cnt > r_cnt) {
            chArr[idx] = ')';
            genParen(chArr, l_cnt, r_cnt+1, N);
        }
    }
}