package Backtracking;

import java.util.LinkedList;

public class BeautifulArrangement {
    int arrCnt = 0;
    public int countArrangement(int N) {
        LinkedList<Integer> nums = new LinkedList<>();
        int i = 1;
        while(i <= N)
            nums.add(i++);
        countArrangement(1, nums);
        return arrCnt;
    }

    private void countArrangement(int idx, LinkedList<Integer> nums){
        
        if(nums.isEmpty()){
            arrCnt++;
            return;
        }

        int nextIdx = idx+1;
        for(int n : nums)
            if(n%idx == 0 || idx%n == 0){
                LinkedList<Integer> remainNums = (LinkedList<Integer>)(nums.clone());
                remainNums.remove((Object)n);
                countArrangement(nextIdx, remainNums);
            }

        return;
    }
}