import java.util.Arrays;
import Backtracking.*;

class Tester {
    public static void main(String[] args) {
        CombinationSumII testInstance = new CombinationSumII();
        Object ans = testInstance.combinationSum2(
            new int[]{10, 1, 2, 7, 6, 1, 5}, 8
        );
        // System.out.print(ans.toString());
//     System.out.println(Arrays.toString((String [])ans));
        if (ans instanceof int[][])
            System.out.println(Arrays.deepToString((int[][]) ans));
        else if (ans instanceof int[])
            System.out.println(Arrays.toString((int[]) ans));
        else if (ans instanceof Integer)
            System.out.println(ans);
        else System.out.println(ans);
    }
}