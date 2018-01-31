import java.util.Arrays;
import Backtracking.*;
import BinarySearch.ValidPerfectSquare;

class Tester {
    public static void main(String[] args) {
        ValidPerfectSquare testInstance = new ValidPerfectSquare();
        Object ans = testInstance.isPerfectSquare(10001*10001);
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