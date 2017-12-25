import java.util.Arrays;
import Math.SelfDividingNumbers;

class Tester {
    public static void main(String[] args) {
        SelfDividingNumbers testInstance = new SelfDividingNumbers();
        Object ans = testInstance.selfDividingNumbers(9,22);

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