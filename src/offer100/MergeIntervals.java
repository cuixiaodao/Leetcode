package offer100;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

// https://leetcode-cn.com/problems/merge-intervals/
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        // todo 熟悉自带数据接口操作方法，comparator定义

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(x -> x[0]));
        for (int[] range : intervals) {
            pq.offer(range);
        }

        List<int[]> ranges = new LinkedList<>();
        int[] curMerge = null;
        int[] minRange;
        while(!pq.isEmpty()) {
            minRange = pq.poll();
            if (curMerge == null) {
                curMerge = minRange;
            } else {
                if (minRange[0] > curMerge[1]) {
                    ranges.add(curMerge);
                    curMerge = minRange;
                } else if (curMerge[1] < minRange[1]) {
                    curMerge[1] = minRange[1];
                }
            }
        }
        ranges.add(curMerge);
        return ranges.toArray(new int[0][0]);
    }
}
