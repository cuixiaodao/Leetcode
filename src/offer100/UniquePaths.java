package offer100;

class UniquePaths {
    public int uniquePaths(int m, int n) {
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        long s = 1;
        String mul = "", div = "";
        for (int i = 1; i <= n - 1; i++) {
            s = s * (m + n - 1 - i) / i;
            // System.out.println(i);
            // mul += "*" + (m + n - 1 - i);
            // div += "*" + i;
        }
        // System.out.println(mul);
        // System.out.println(div);
        return (int)s;
    }
}