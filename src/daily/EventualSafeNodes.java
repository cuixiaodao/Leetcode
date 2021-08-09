package daily;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/find-eventual-safe-states/
 */
class EventualSafeNodes {
    Set<Integer> safePoints= new HashSet<>();
    Set<Integer> notSafePoints= new HashSet<>();
    boolean[] visted;

    public List<Integer> eventualSafeNodes(int[][] graph) {
        visted = new boolean[graph.length];
        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (isSafePoint(i, graph)) {
                ans.add(i);
            } else {
                notSafePoints.add(i);
            }
        }
        return ans;
    }

    private boolean isSafePoint(int i, int[][] graph) {
        for (int n : graph[i]) {
            if (safePoints.contains(n)) {
                continue;
            }
            if (notSafePoints.contains(n)) {
                return false;
            }

            if (visted[n]) {
                return false;
            } else {
                visted[n] = true;
                if (isSafePoint(n, graph)) {
                    safePoints.add(n);
                    visted[n] = false;
                } else {
                    notSafePoints.add(n);
                    return false;
                }
            }

        }
        return true;
    }
}