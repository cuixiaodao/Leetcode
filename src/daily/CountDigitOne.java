class Solution {
    public int countDigitOne(int n) {
        int k = 0, upper = n, down = 0, base = 1;

        int total = 0;
        while(upper > 0) {
            k = upper % 10;
            upper = upper / 10;
           
            if (k > 1) {
                total += (upper + 1) * base;
            } else if (k == 1) {
                total += upper * base + down + 1;
            } else {
                total += upper * base;
            }
            // System.out.printf("k = %d, upper = %d, down = %d, base = %d, total = %d\n", 
            // k, upper, down, base, total);
            
            down += base * k;
            base *= 10;
        }
        return total;
    }
}
