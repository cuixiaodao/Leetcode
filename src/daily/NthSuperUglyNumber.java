package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NthSuperUglyNumber {
    class Ugly {
        public int primeIdx;
        public int uglyIdx;
        public int value;

        public Ugly(int primeIdx, int uglyIdx, int value) {
            this.primeIdx = primeIdx;
            this.uglyIdx = uglyIdx;
            this.value = value;
        }
    }

    public int nthSuperUglyNumber(int n, int[] primes) {
        List<Integer> uglyNums = new ArrayList<>();
        uglyNums.add(1);

        Arrays.sort(primes);
        // next ugly in increasing order;
        Ugly[] nextUgly = new Ugly[primes.length];

        for(int i = 0; i < primes.length; i++) {
            nextUgly[i] = new Ugly(i, 0, uglyNums.get(0) * primes[i]);
        }

        Ugly minUgly = null;
        while(uglyNums.size() < n) {
            minUgly = nextUgly[0];
            uglyNums.add(minUgly.value);
            updateNextUgly(minUgly, uglyNums, primes);

            int i = 0;
            while(i < nextUgly.length - 1 && minUgly.value >= nextUgly[i+1].value) {
                if (minUgly.value == nextUgly[i+1].value) {
                    updateNextUgly(minUgly, uglyNums, primes);
                }
                nextUgly[i] = nextUgly[i+1];
                i++;
            }
            nextUgly[i] = minUgly;

            // System.out.println(Arrays.toString(nextUgly));
            // System.out.println(uglyNums);
            // System.out.println();
        }
        return uglyNums.get(n - 1);
    }

    private void updateNextUgly(Ugly ugly, List<Integer> uglyNums, int[] primes){
        ugly.uglyIdx++;
        ugly.value = uglyNums.get(ugly.uglyIdx) * primes[ugly.primeIdx];
    }
}
