package hashTable;

/**
 * Created by cuixiaodao on 11/04/2017
 * for leetCode problem:
 * https://leetcode.com/problems/island-perimeter/description/
 */

public class HappyNumber {
    public boolean isHappy(int n) {
        // 通过slow, fast来判断是否成环
        int slow = n, fast = n;
        do {
            slow = getDigitSum(slow);
            fast = getDigitSum(getDigitSum(fast));
        } while (slow != fast && fast != 1);

        return fast == 1;
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

    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(19));
    }
}
