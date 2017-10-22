import array.*;

import java.util.Arrays;

class Tester{
    public static void main(String[] args){
        int[] a = {0, 2,1, 3};
        MissingNumber testInstance = new MissingNumber();
        Object ans = testInstance.missingNumber(a);

        if(ans instanceof int[][])
            System.out.println(Arrays.deepToString((int[][])ans));
        else if(ans instanceof int[])
            System.out.println(Arrays.toString((int[])ans));
        else if(ans instanceof Integer)
            System.out.println(ans);
        else System.out.println("ans wrong");
    }
}