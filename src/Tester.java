import java.util.Arrays;
import Backtracking.*;

class Tester {
    public static void main(String[] args) {
        SubsetsII testInstance = new SubsetsII();
        Object ans = testInstance.subsetsWithDup(new int[]{});
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