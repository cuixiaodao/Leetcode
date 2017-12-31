import java.util.Arrays;
import Math.*;

class Tester {
    public static void main(String[] args) {
        ArithmeticSlices testInstance = new ArithmeticSlices();
        Object ans = testInstance.numberOfArithmeticSlices(new int[]{7, 7, 7, 7, 1, 2, 5, 8});

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