import java.util.Arrays;
import Math.*;

class Tester {
    public static void main(String[] args) {
        MinMoves2 testInstance = new MinMoves2();
        Object ans = testInstance.minMoves2(new int[]{1,2,3});
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