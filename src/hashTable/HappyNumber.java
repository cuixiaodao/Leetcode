package hashTable;

/**
 * Created by cuixiaodao on 11/04/2017
 * for leetCode problem:
 * https://leetcode.com/problems/island-perimeter/description/
 */

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = getDigitSum(n), fast = getDigitSum(getDigitSum(n));
        while (slow != fast) {
            slow = getDigitSum(n);
            fast = getDigitSum(getDigitSum(n));
        }
        return slow == 1;
    }

    private int getDigitSum(int n) {
        int s = 0, r = 0;
        while (n != 0) {
            r = n % 10;
            n = n / 10;
            s += r * r;
        }
        return s;
    }
}
