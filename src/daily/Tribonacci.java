package daily;

public class Tribonacci {
    public int tribonacci(int n) {
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;

        if (n == 0) {
            return 0;
        }

        int i = 2;
        int tmp2;
        while (i++ < n ) {
            // 注意tmp
            tmp2 = t2;
            t2 += t1 + t0;

            t0 = t1;
            t1 = tmp2;
        }
        return t2;
    }
}
