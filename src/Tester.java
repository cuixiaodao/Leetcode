import java.util.Arrays;
import Math.*;

class Tester {
    public static void main(String[] args) {
        ReverseInteger testInstance = new ReverseInteger();
        Object ans = testInstance.reverse(-1534236469);

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