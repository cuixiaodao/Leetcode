package daily;

public class CircularArrayLoop {
    public boolean circularArrayLoop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (isCircular(i, nums)) {
                // System.out.println(i);
                return true;
            }
        }
        return false;
    }

    private boolean isCircular(int i, int[] nums) {
        int slow = i;
        int f0 = i;
        int f1, fast;

        do {
            f1 = getNextIdx(f0, nums);
            if (nums[f0] * nums[f1] <= 0) {
                nums[f0] = 0;
                return false;
            }

            fast = getNextIdx(f1, nums);
            if (nums[f1] * nums[fast] <= 0) {
                nums[f1] = 0;
                return false;
            }
            f0 = fast;

            slow = getNextIdx(slow, nums);
            // System.out.printf("s: %d, f: %d", slow, fast);
        } while (slow != fast);

        // System.out.println();
        return slow != getNextIdx(slow, nums);
    }

    private int getNextIdx(int i, int[] nums) {
        int next;
        if (nums[i] == 0) {
            next = 0;
        } else if (nums[i] > 0) {
            next = (i + nums[i]) % nums.length;
        } else {
            next = (i + nums[i]) % nums.length;
            if (next < 0) {
                next += nums.length;
            }
        }
        return next;
    }

    public static void main(String[] args) {
        CircularArrayLoop circularArrayLoop = new CircularArrayLoop();
        boolean res = circularArrayLoop.circularArrayLoop(new int[] {-2, 1, -1, -2, -2});
        System.out.println(res);
    }
}
