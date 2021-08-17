package daily;

import java.util.HashSet;
import java.util.Set;

// 526
public class CountArrangement {
    public int countArrangement(int n) {
        return countArrangement(n, 1, new HashSet<>());
    }

    public int countArrangement(int n, int startIdx, Set<Integer> used) {
        int total = 0;
        if (startIdx > n) {
            return 1;
        }
        for(int i = 1; i <= n; i++) {
            if (used.contains(i)) {
                continue;
            }
            if (i % startIdx == 0 || startIdx % i == 0) {
                used.add(i);
                total += countArrangement(n, startIdx + 1, used);
                used.remove(i);
            }
        }
        return total;
    }
}
